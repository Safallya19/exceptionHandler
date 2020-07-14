package com.mindtree.exceptionhandler.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mindtree.exceptionhandler.ExceptionHandlerFramework;
import com.mindtree.exceptionhandler.annotation.HandleException;
import com.mindtree.exceptionhandler.annotation.HandleExceptions;
import com.mindtree.exceptionhandler.exception.BaseException;

@Aspect
@Component
public class HandleExceptionAspect {

    @Autowired
    private ExceptionHandlerFramework<BaseException> exceptionHandlerFramework;

    /**
     * Called while method annotated with @HanldeExceptions to handle multiple exception
     *
     * @param joinPoint
     * @param exp
     * @param handleExceptionsAnnotation
     */
    @AfterThrowing(value = "execution(@com.mindtree.exceptionhandler.annotation.HandleExceptions * *(..)) && @annotation(handleExceptionsAnnotation) ", throwing = "exp")
    public void aspectToHandleMultipleExceptions(final JoinPoint joinPoint,
            final Exception exp,
            final HandleExceptions handleExceptionsAnnotation) {

        HandleException[] handleExceptionArr = handleExceptionsAnnotation
                .value();
        for (HandleException handelException : handleExceptionArr) {
            Class<?> clazz = handelException.exceptionType();
            if (exp.getClass().equals(clazz) || clazz.isInstance(exp)) {
            	System.out.println("handelException class : "+ handelException);
                handleException(exp, handelException);
                break;
            }
        }
    }

    /**
     * Called while method annotated with @HanldeException to handle single exception
     * @param joinPoint
     * @param exp
     * @param handleExceptionAnnotation 
     */
    @AfterThrowing(value = "execution(@com.mindtree.exceptionhandler.annotation.HandleException * *(..)) && @annotation(handleExceptionAnnotation)   ", throwing = "exp")
    public void aspectToHandleSingleException(final JoinPoint joinPoint,
            final Exception exp, final HandleException handleExceptionAnnotation) {
        handleException(exp, handleExceptionAnnotation);
    }

    private void handleException(final Exception exp,
            HandleException handelException) {
        BaseException baseException = null;
        if (exp instanceof BaseException) {

            baseException = (BaseException) exp;

        } else {
            baseException = new BaseException(exp);
        }

        exceptionHandlerFramework.handleException(baseException,
                handelException.handlers());
    }
}

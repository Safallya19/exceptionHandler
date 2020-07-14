/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.mindtree.exceptionhandler.model;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Content extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3560488618366183640L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Content\",\"fields\":[{\"name\":\"errorType\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"errorMessage\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"errorCode\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Content> ENCODER =
      new BinaryMessageEncoder<Content>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Content> DECODER =
      new BinaryMessageDecoder<Content>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Content> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Content> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Content> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Content>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Content to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Content from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Content instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Content fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.String errorType;
  @Deprecated public java.lang.String errorMessage;
  @Deprecated public java.lang.String errorCode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Content() {}

  /**
   * All-args constructor.
   * @param errorType The new value for errorType
   * @param errorMessage The new value for errorMessage
   * @param errorCode The new value for errorCode
   */
  public Content(java.lang.String errorType, java.lang.String errorMessage, java.lang.String errorCode) {
    this.errorType = errorType;
    this.errorMessage = errorMessage;
    this.errorCode = errorCode;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return errorType;
    case 1: return errorMessage;
    case 2: return errorCode;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: errorType = value$ != null ? value$.toString() : null; break;
    case 1: errorMessage = value$ != null ? value$.toString() : null; break;
    case 2: errorCode = value$ != null ? value$.toString() : null; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'errorType' field.
   * @return The value of the 'errorType' field.
   */
  public java.lang.String getErrorType() {
    return errorType;
  }


  /**
   * Sets the value of the 'errorType' field.
   * @param value the value to set.
   */
  public void setErrorType(java.lang.String value) {
    this.errorType = value;
  }

  /**
   * Gets the value of the 'errorMessage' field.
   * @return The value of the 'errorMessage' field.
   */
  public java.lang.String getErrorMessage() {
    return errorMessage;
  }


  /**
   * Sets the value of the 'errorMessage' field.
   * @param value the value to set.
   */
  public void setErrorMessage(java.lang.String value) {
    this.errorMessage = value;
  }

  /**
   * Gets the value of the 'errorCode' field.
   * @return The value of the 'errorCode' field.
   */
  public java.lang.String getErrorCode() {
    return errorCode;
  }


  /**
   * Sets the value of the 'errorCode' field.
   * @param value the value to set.
   */
  public void setErrorCode(java.lang.String value) {
    this.errorCode = value;
  }

  /**
   * Creates a new Content RecordBuilder.
   * @return A new Content RecordBuilder
   */
  public static Content.Builder newBuilder() {
    return new Content.Builder();
  }

  /**
   * Creates a new Content RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Content RecordBuilder
   */
  public static Content.Builder newBuilder(Content.Builder other) {
    if (other == null) {
      return new Content.Builder();
    } else {
      return new Content.Builder(other);
    }
  }

  /**
   * Creates a new Content RecordBuilder by copying an existing Content instance.
   * @param other The existing instance to copy.
   * @return A new Content RecordBuilder
   */
  public static Content.Builder newBuilder(Content other) {
    if (other == null) {
      return new Content.Builder();
    } else {
      return new Content.Builder(other);
    }
  }

  /**
   * RecordBuilder for Content instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Content>
    implements org.apache.avro.data.RecordBuilder<Content> {

    private java.lang.String errorType;
    private java.lang.String errorMessage;
    private java.lang.String errorCode;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Content.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.errorType)) {
        this.errorType = data().deepCopy(fields()[0].schema(), other.errorType);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.errorMessage)) {
        this.errorMessage = data().deepCopy(fields()[1].schema(), other.errorMessage);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.errorCode)) {
        this.errorCode = data().deepCopy(fields()[2].schema(), other.errorCode);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing Content instance
     * @param other The existing instance to copy.
     */
    private Builder(Content other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.errorType)) {
        this.errorType = data().deepCopy(fields()[0].schema(), other.errorType);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.errorMessage)) {
        this.errorMessage = data().deepCopy(fields()[1].schema(), other.errorMessage);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.errorCode)) {
        this.errorCode = data().deepCopy(fields()[2].schema(), other.errorCode);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'errorType' field.
      * @return The value.
      */
    public java.lang.String getErrorType() {
      return errorType;
    }


    /**
      * Sets the value of the 'errorType' field.
      * @param value The value of 'errorType'.
      * @return This builder.
      */
    public Content.Builder setErrorType(java.lang.String value) {
      validate(fields()[0], value);
      this.errorType = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'errorType' field has been set.
      * @return True if the 'errorType' field has been set, false otherwise.
      */
    public boolean hasErrorType() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'errorType' field.
      * @return This builder.
      */
    public Content.Builder clearErrorType() {
      errorType = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'errorMessage' field.
      * @return The value.
      */
    public java.lang.String getErrorMessage() {
      return errorMessage;
    }


    /**
      * Sets the value of the 'errorMessage' field.
      * @param value The value of 'errorMessage'.
      * @return This builder.
      */
    public Content.Builder setErrorMessage(java.lang.String value) {
      validate(fields()[1], value);
      this.errorMessage = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'errorMessage' field has been set.
      * @return True if the 'errorMessage' field has been set, false otherwise.
      */
    public boolean hasErrorMessage() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'errorMessage' field.
      * @return This builder.
      */
    public Content.Builder clearErrorMessage() {
      errorMessage = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'errorCode' field.
      * @return The value.
      */
    public java.lang.String getErrorCode() {
      return errorCode;
    }


    /**
      * Sets the value of the 'errorCode' field.
      * @param value The value of 'errorCode'.
      * @return This builder.
      */
    public Content.Builder setErrorCode(java.lang.String value) {
      validate(fields()[2], value);
      this.errorCode = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'errorCode' field has been set.
      * @return True if the 'errorCode' field has been set, false otherwise.
      */
    public boolean hasErrorCode() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'errorCode' field.
      * @return This builder.
      */
    public Content.Builder clearErrorCode() {
      errorCode = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Content build() {
      try {
        Content record = new Content();
        record.errorType = fieldSetFlags()[0] ? this.errorType : (java.lang.String) defaultValue(fields()[0]);
        record.errorMessage = fieldSetFlags()[1] ? this.errorMessage : (java.lang.String) defaultValue(fields()[1]);
        record.errorCode = fieldSetFlags()[2] ? this.errorCode : (java.lang.String) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Content>
    WRITER$ = (org.apache.avro.io.DatumWriter<Content>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Content>
    READER$ = (org.apache.avro.io.DatumReader<Content>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.errorType);

    out.writeString(this.errorMessage);

    out.writeString(this.errorCode);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.errorType = in.readString();

      this.errorMessage = in.readString();

      this.errorCode = in.readString();

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.errorType = in.readString();
          break;

        case 1:
          this.errorMessage = in.readString();
          break;

        case 2:
          this.errorCode = in.readString();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}











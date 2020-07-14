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
public class Event extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6562871502866039457L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Event\",\"fields\":[{\"name\":\"traceId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"appVersion\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"environment\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"raiseIncident\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"businessGroup\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"appName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"correlationId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"threadName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"content\",\"type\":{\"type\":\"record\",\"name\":\"Content\",\"fields\":[{\"name\":\"errorType\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"errorMessage\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"errorCode\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}},{\"name\":\"timestamp\",\"type\":\"int\",\"logicalType\":\"date\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Event> ENCODER =
      new BinaryMessageEncoder<Event>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Event> DECODER =
      new BinaryMessageDecoder<Event>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Event> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Event> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Event> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Event>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Event to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Event from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Event instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Event fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.String traceId;
  @Deprecated public java.lang.String appVersion;
  @Deprecated public java.lang.String environment;
  @Deprecated public java.lang.String raiseIncident;
  @Deprecated public java.lang.String businessGroup;
  @Deprecated public java.lang.String appName;
  @Deprecated public java.lang.String correlationId;
  @Deprecated public java.lang.String threadName;
  @Deprecated public Content content;
  @Deprecated public int timestamp;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Event() {}

  /**
   * All-args constructor.
   * @param traceId The new value for traceId
   * @param appVersion The new value for appVersion
   * @param environment The new value for environment
   * @param raiseIncident The new value for raiseIncident
   * @param businessGroup The new value for businessGroup
   * @param appName The new value for appName
   * @param correlationId The new value for correlationId
   * @param threadName The new value for threadName
   * @param content The new value for content
   * @param timestamp The new value for timestamp
   */
  public Event(java.lang.String traceId, java.lang.String appVersion, java.lang.String environment, java.lang.String raiseIncident, java.lang.String businessGroup, java.lang.String appName, java.lang.String correlationId, java.lang.String threadName, Content content, java.lang.Integer timestamp) {
    this.traceId = traceId;
    this.appVersion = appVersion;
    this.environment = environment;
    this.raiseIncident = raiseIncident;
    this.businessGroup = businessGroup;
    this.appName = appName;
    this.correlationId = correlationId;
    this.threadName = threadName;
    this.content = content;
    this.timestamp = timestamp;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return traceId;
    case 1: return appVersion;
    case 2: return environment;
    case 3: return raiseIncident;
    case 4: return businessGroup;
    case 5: return appName;
    case 6: return correlationId;
    case 7: return threadName;
    case 8: return content;
    case 9: return timestamp;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: traceId = value$ != null ? value$.toString() : null; break;
    case 1: appVersion = value$ != null ? value$.toString() : null; break;
    case 2: environment = value$ != null ? value$.toString() : null; break;
    case 3: raiseIncident = value$ != null ? value$.toString() : null; break;
    case 4: businessGroup = value$ != null ? value$.toString() : null; break;
    case 5: appName = value$ != null ? value$.toString() : null; break;
    case 6: correlationId = value$ != null ? value$.toString() : null; break;
    case 7: threadName = value$ != null ? value$.toString() : null; break;
    case 8: content = (Content)value$; break;
    case 9: timestamp = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'traceId' field.
   * @return The value of the 'traceId' field.
   */
  public java.lang.String getTraceId() {
    return traceId;
  }


  /**
   * Sets the value of the 'traceId' field.
   * @param value the value to set.
   */
  public void setTraceId(java.lang.String value) {
    this.traceId = value;
  }

  /**
   * Gets the value of the 'appVersion' field.
   * @return The value of the 'appVersion' field.
   */
  public java.lang.String getAppVersion() {
    return appVersion;
  }


  /**
   * Sets the value of the 'appVersion' field.
   * @param value the value to set.
   */
  public void setAppVersion(java.lang.String value) {
    this.appVersion = value;
  }

  /**
   * Gets the value of the 'environment' field.
   * @return The value of the 'environment' field.
   */
  public java.lang.String getEnvironment() {
    return environment;
  }


  /**
   * Sets the value of the 'environment' field.
   * @param value the value to set.
   */
  public void setEnvironment(java.lang.String value) {
    this.environment = value;
  }

  /**
   * Gets the value of the 'raiseIncident' field.
   * @return The value of the 'raiseIncident' field.
   */
  public java.lang.String getRaiseIncident() {
    return raiseIncident;
  }


  /**
   * Sets the value of the 'raiseIncident' field.
   * @param value the value to set.
   */
  public void setRaiseIncident(java.lang.String value) {
    this.raiseIncident = value;
  }

  /**
   * Gets the value of the 'businessGroup' field.
   * @return The value of the 'businessGroup' field.
   */
  public java.lang.String getBusinessGroup() {
    return businessGroup;
  }


  /**
   * Sets the value of the 'businessGroup' field.
   * @param value the value to set.
   */
  public void setBusinessGroup(java.lang.String value) {
    this.businessGroup = value;
  }

  /**
   * Gets the value of the 'appName' field.
   * @return The value of the 'appName' field.
   */
  public java.lang.String getAppName() {
    return appName;
  }


  /**
   * Sets the value of the 'appName' field.
   * @param value the value to set.
   */
  public void setAppName(java.lang.String value) {
    this.appName = value;
  }

  /**
   * Gets the value of the 'correlationId' field.
   * @return The value of the 'correlationId' field.
   */
  public java.lang.String getCorrelationId() {
    return correlationId;
  }


  /**
   * Sets the value of the 'correlationId' field.
   * @param value the value to set.
   */
  public void setCorrelationId(java.lang.String value) {
    this.correlationId = value;
  }

  /**
   * Gets the value of the 'threadName' field.
   * @return The value of the 'threadName' field.
   */
  public java.lang.String getThreadName() {
    return threadName;
  }


  /**
   * Sets the value of the 'threadName' field.
   * @param value the value to set.
   */
  public void setThreadName(java.lang.String value) {
    this.threadName = value;
  }

  /**
   * Gets the value of the 'content' field.
   * @return The value of the 'content' field.
   */
  public Content getContent() {
    return content;
  }


  /**
   * Sets the value of the 'content' field.
   * @param value the value to set.
   */
  public void setContent(Content value) {
    this.content = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return The value of the 'timestamp' field.
   */
  public int getTimestamp() {
    return timestamp;
  }


  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(int value) {
    this.timestamp = value;
  }

  /**
   * Creates a new Event RecordBuilder.
   * @return A new Event RecordBuilder
   */
  public static Event.Builder newBuilder() {
    return new Event.Builder();
  }

  /**
   * Creates a new Event RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Event RecordBuilder
   */
  public static Event.Builder newBuilder(Event.Builder other) {
    if (other == null) {
      return new Event.Builder();
    } else {
      return new Event.Builder(other);
    }
  }

  /**
   * Creates a new Event RecordBuilder by copying an existing Event instance.
   * @param other The existing instance to copy.
   * @return A new Event RecordBuilder
   */
  public static Event.Builder newBuilder(Event other) {
    if (other == null) {
      return new Event.Builder();
    } else {
      return new Event.Builder(other);
    }
  }

  /**
   * RecordBuilder for Event instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Event>
    implements org.apache.avro.data.RecordBuilder<Event> {

    private java.lang.String traceId;
    private java.lang.String appVersion;
    private java.lang.String environment;
    private java.lang.String raiseIncident;
    private java.lang.String businessGroup;
    private java.lang.String appName;
    private java.lang.String correlationId;
    private java.lang.String threadName;
    private Content content;
    private Content.Builder contentBuilder;
    private int timestamp;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Event.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.traceId)) {
        this.traceId = data().deepCopy(fields()[0].schema(), other.traceId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.appVersion)) {
        this.appVersion = data().deepCopy(fields()[1].schema(), other.appVersion);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.environment)) {
        this.environment = data().deepCopy(fields()[2].schema(), other.environment);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.raiseIncident)) {
        this.raiseIncident = data().deepCopy(fields()[3].schema(), other.raiseIncident);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.businessGroup)) {
        this.businessGroup = data().deepCopy(fields()[4].schema(), other.businessGroup);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.appName)) {
        this.appName = data().deepCopy(fields()[5].schema(), other.appName);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.correlationId)) {
        this.correlationId = data().deepCopy(fields()[6].schema(), other.correlationId);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.threadName)) {
        this.threadName = data().deepCopy(fields()[7].schema(), other.threadName);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
      if (isValidValue(fields()[8], other.content)) {
        this.content = data().deepCopy(fields()[8].schema(), other.content);
        fieldSetFlags()[8] = other.fieldSetFlags()[8];
      }
      if (other.hasContentBuilder()) {
        this.contentBuilder = Content.newBuilder(other.getContentBuilder());
      }
      if (isValidValue(fields()[9], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[9].schema(), other.timestamp);
        fieldSetFlags()[9] = other.fieldSetFlags()[9];
      }
    }

    /**
     * Creates a Builder by copying an existing Event instance
     * @param other The existing instance to copy.
     */
    private Builder(Event other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.traceId)) {
        this.traceId = data().deepCopy(fields()[0].schema(), other.traceId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.appVersion)) {
        this.appVersion = data().deepCopy(fields()[1].schema(), other.appVersion);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.environment)) {
        this.environment = data().deepCopy(fields()[2].schema(), other.environment);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.raiseIncident)) {
        this.raiseIncident = data().deepCopy(fields()[3].schema(), other.raiseIncident);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.businessGroup)) {
        this.businessGroup = data().deepCopy(fields()[4].schema(), other.businessGroup);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.appName)) {
        this.appName = data().deepCopy(fields()[5].schema(), other.appName);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.correlationId)) {
        this.correlationId = data().deepCopy(fields()[6].schema(), other.correlationId);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.threadName)) {
        this.threadName = data().deepCopy(fields()[7].schema(), other.threadName);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.content)) {
        this.content = data().deepCopy(fields()[8].schema(), other.content);
        fieldSetFlags()[8] = true;
      }
      this.contentBuilder = null;
      if (isValidValue(fields()[9], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[9].schema(), other.timestamp);
        fieldSetFlags()[9] = true;
      }
    }

    /**
      * Gets the value of the 'traceId' field.
      * @return The value.
      */
    public java.lang.String getTraceId() {
      return traceId;
    }


    /**
      * Sets the value of the 'traceId' field.
      * @param value The value of 'traceId'.
      * @return This builder.
      */
    public Event.Builder setTraceId(java.lang.String value) {
      validate(fields()[0], value);
      this.traceId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'traceId' field has been set.
      * @return True if the 'traceId' field has been set, false otherwise.
      */
    public boolean hasTraceId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'traceId' field.
      * @return This builder.
      */
    public Event.Builder clearTraceId() {
      traceId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'appVersion' field.
      * @return The value.
      */
    public java.lang.String getAppVersion() {
      return appVersion;
    }


    /**
      * Sets the value of the 'appVersion' field.
      * @param value The value of 'appVersion'.
      * @return This builder.
      */
    public Event.Builder setAppVersion(java.lang.String value) {
      validate(fields()[1], value);
      this.appVersion = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'appVersion' field has been set.
      * @return True if the 'appVersion' field has been set, false otherwise.
      */
    public boolean hasAppVersion() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'appVersion' field.
      * @return This builder.
      */
    public Event.Builder clearAppVersion() {
      appVersion = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'environment' field.
      * @return The value.
      */
    public java.lang.String getEnvironment() {
      return environment;
    }


    /**
      * Sets the value of the 'environment' field.
      * @param value The value of 'environment'.
      * @return This builder.
      */
    public Event.Builder setEnvironment(java.lang.String value) {
      validate(fields()[2], value);
      this.environment = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'environment' field has been set.
      * @return True if the 'environment' field has been set, false otherwise.
      */
    public boolean hasEnvironment() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'environment' field.
      * @return This builder.
      */
    public Event.Builder clearEnvironment() {
      environment = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'raiseIncident' field.
      * @return The value.
      */
    public java.lang.String getRaiseIncident() {
      return raiseIncident;
    }


    /**
      * Sets the value of the 'raiseIncident' field.
      * @param value The value of 'raiseIncident'.
      * @return This builder.
      */
    public Event.Builder setRaiseIncident(java.lang.String value) {
      validate(fields()[3], value);
      this.raiseIncident = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'raiseIncident' field has been set.
      * @return True if the 'raiseIncident' field has been set, false otherwise.
      */
    public boolean hasRaiseIncident() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'raiseIncident' field.
      * @return This builder.
      */
    public Event.Builder clearRaiseIncident() {
      raiseIncident = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'businessGroup' field.
      * @return The value.
      */
    public java.lang.String getBusinessGroup() {
      return businessGroup;
    }


    /**
      * Sets the value of the 'businessGroup' field.
      * @param value The value of 'businessGroup'.
      * @return This builder.
      */
    public Event.Builder setBusinessGroup(java.lang.String value) {
      validate(fields()[4], value);
      this.businessGroup = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'businessGroup' field has been set.
      * @return True if the 'businessGroup' field has been set, false otherwise.
      */
    public boolean hasBusinessGroup() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'businessGroup' field.
      * @return This builder.
      */
    public Event.Builder clearBusinessGroup() {
      businessGroup = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'appName' field.
      * @return The value.
      */
    public java.lang.String getAppName() {
      return appName;
    }


    /**
      * Sets the value of the 'appName' field.
      * @param value The value of 'appName'.
      * @return This builder.
      */
    public Event.Builder setAppName(java.lang.String value) {
      validate(fields()[5], value);
      this.appName = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'appName' field has been set.
      * @return True if the 'appName' field has been set, false otherwise.
      */
    public boolean hasAppName() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'appName' field.
      * @return This builder.
      */
    public Event.Builder clearAppName() {
      appName = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'correlationId' field.
      * @return The value.
      */
    public java.lang.String getCorrelationId() {
      return correlationId;
    }


    /**
      * Sets the value of the 'correlationId' field.
      * @param value The value of 'correlationId'.
      * @return This builder.
      */
    public Event.Builder setCorrelationId(java.lang.String value) {
      validate(fields()[6], value);
      this.correlationId = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'correlationId' field has been set.
      * @return True if the 'correlationId' field has been set, false otherwise.
      */
    public boolean hasCorrelationId() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'correlationId' field.
      * @return This builder.
      */
    public Event.Builder clearCorrelationId() {
      correlationId = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'threadName' field.
      * @return The value.
      */
    public java.lang.String getThreadName() {
      return threadName;
    }


    /**
      * Sets the value of the 'threadName' field.
      * @param value The value of 'threadName'.
      * @return This builder.
      */
    public Event.Builder setThreadName(java.lang.String value) {
      validate(fields()[7], value);
      this.threadName = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'threadName' field has been set.
      * @return True if the 'threadName' field has been set, false otherwise.
      */
    public boolean hasThreadName() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'threadName' field.
      * @return This builder.
      */
    public Event.Builder clearThreadName() {
      threadName = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'content' field.
      * @return The value.
      */
    public Content getContent() {
      return content;
    }


    /**
      * Sets the value of the 'content' field.
      * @param value The value of 'content'.
      * @return This builder.
      */
    public Event.Builder setContent(Content value) {
      validate(fields()[8], value);
      this.contentBuilder = null;
      this.content = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'content' field has been set.
      * @return True if the 'content' field has been set, false otherwise.
      */
    public boolean hasContent() {
      return fieldSetFlags()[8];
    }

    /**
     * Gets the Builder instance for the 'content' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public Content.Builder getContentBuilder() {
      if (contentBuilder == null) {
        if (hasContent()) {
          setContentBuilder(Content.newBuilder(content));
        } else {
          setContentBuilder(Content.newBuilder());
        }
      }
      return contentBuilder;
    }

    /**
     * Sets the Builder instance for the 'content' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public Event.Builder setContentBuilder(Content.Builder value) {
      clearContent();
      contentBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'content' field has an active Builder instance
     * @return True if the 'content' field has an active Builder instance
     */
    public boolean hasContentBuilder() {
      return contentBuilder != null;
    }

    /**
      * Clears the value of the 'content' field.
      * @return This builder.
      */
    public Event.Builder clearContent() {
      content = null;
      contentBuilder = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestamp' field.
      * @return The value.
      */
    public int getTimestamp() {
      return timestamp;
    }


    /**
      * Sets the value of the 'timestamp' field.
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public Event.Builder setTimestamp(int value) {
      validate(fields()[9], value);
      this.timestamp = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public Event.Builder clearTimestamp() {
      fieldSetFlags()[9] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Event build() {
      try {
        Event record = new Event();
        record.traceId = fieldSetFlags()[0] ? this.traceId : (java.lang.String) defaultValue(fields()[0]);
        record.appVersion = fieldSetFlags()[1] ? this.appVersion : (java.lang.String) defaultValue(fields()[1]);
        record.environment = fieldSetFlags()[2] ? this.environment : (java.lang.String) defaultValue(fields()[2]);
        record.raiseIncident = fieldSetFlags()[3] ? this.raiseIncident : (java.lang.String) defaultValue(fields()[3]);
        record.businessGroup = fieldSetFlags()[4] ? this.businessGroup : (java.lang.String) defaultValue(fields()[4]);
        record.appName = fieldSetFlags()[5] ? this.appName : (java.lang.String) defaultValue(fields()[5]);
        record.correlationId = fieldSetFlags()[6] ? this.correlationId : (java.lang.String) defaultValue(fields()[6]);
        record.threadName = fieldSetFlags()[7] ? this.threadName : (java.lang.String) defaultValue(fields()[7]);
        if (contentBuilder != null) {
          try {
            record.content = this.contentBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("content"));
            throw e;
          }
        } else {
          record.content = fieldSetFlags()[8] ? this.content : (Content) defaultValue(fields()[8]);
        }
        record.timestamp = fieldSetFlags()[9] ? this.timestamp : (java.lang.Integer) defaultValue(fields()[9]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Event>
    WRITER$ = (org.apache.avro.io.DatumWriter<Event>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Event>
    READER$ = (org.apache.avro.io.DatumReader<Event>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.traceId);

    out.writeString(this.appVersion);

    out.writeString(this.environment);

    out.writeString(this.raiseIncident);

    out.writeString(this.businessGroup);

    out.writeString(this.appName);

    out.writeString(this.correlationId);

    out.writeString(this.threadName);

    this.content.customEncode(out);

    out.writeInt(this.timestamp);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.traceId = in.readString();

      this.appVersion = in.readString();

      this.environment = in.readString();

      this.raiseIncident = in.readString();

      this.businessGroup = in.readString();

      this.appName = in.readString();

      this.correlationId = in.readString();

      this.threadName = in.readString();

      if (this.content == null) {
        this.content = new Content();
      }
      this.content.customDecode(in);

      this.timestamp = in.readInt();

    } else {
      for (int i = 0; i < 10; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.traceId = in.readString();
          break;

        case 1:
          this.appVersion = in.readString();
          break;

        case 2:
          this.environment = in.readString();
          break;

        case 3:
          this.raiseIncident = in.readString();
          break;

        case 4:
          this.businessGroup = in.readString();
          break;

        case 5:
          this.appName = in.readString();
          break;

        case 6:
          this.correlationId = in.readString();
          break;

        case 7:
          this.threadName = in.readString();
          break;

        case 8:
          if (this.content == null) {
            this.content = new Content();
          }
          this.content.customDecode(in);
          break;

        case 9:
          this.timestamp = in.readInt();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}











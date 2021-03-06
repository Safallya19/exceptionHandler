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
public class ErrorSchema extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7415921147232842178L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ErrorSchema\",\"fields\":[{\"name\":\"sourcetype\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"event\",\"type\":{\"type\":\"record\",\"name\":\"Event\",\"fields\":[{\"name\":\"traceId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"appVersion\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"environment\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"raiseIncident\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"businessGroup\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"appName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"correlationId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"threadName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"content\",\"type\":{\"type\":\"record\",\"name\":\"Content\",\"fields\":[{\"name\":\"errorType\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"errorMessage\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"errorCode\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}},{\"name\":\"timestamp\",\"type\":\"int\",\"logicalType\":\"date\"}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ErrorSchema> ENCODER =
      new BinaryMessageEncoder<ErrorSchema>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ErrorSchema> DECODER =
      new BinaryMessageDecoder<ErrorSchema>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ErrorSchema> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ErrorSchema> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ErrorSchema> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ErrorSchema>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ErrorSchema to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ErrorSchema from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ErrorSchema instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ErrorSchema fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.String sourcetype;
  @Deprecated public Event event;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ErrorSchema() {}

  /**
   * All-args constructor.
   * @param sourcetype The new value for sourcetype
   * @param event The new value for event
   */
  public ErrorSchema(java.lang.String sourcetype, Event event) {
    this.sourcetype = sourcetype;
    this.event = event;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return sourcetype;
    case 1: return event;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: sourcetype = value$ != null ? value$.toString() : null; break;
    case 1: event = (Event)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'sourcetype' field.
   * @return The value of the 'sourcetype' field.
   */
  public java.lang.String getSourcetype() {
    return sourcetype;
  }


  /**
   * Sets the value of the 'sourcetype' field.
   * @param value the value to set.
   */
  public void setSourcetype(java.lang.String value) {
    this.sourcetype = value;
  }

  /**
   * Gets the value of the 'event' field.
   * @return The value of the 'event' field.
   */
  public Event getEvent() {
    return event;
  }


  /**
   * Sets the value of the 'event' field.
   * @param value the value to set.
   */
  public void setEvent(Event value) {
    this.event = value;
  }

  /**
   * Creates a new ErrorSchema RecordBuilder.
   * @return A new ErrorSchema RecordBuilder
   */
  public static ErrorSchema.Builder newBuilder() {
    return new ErrorSchema.Builder();
  }

  /**
   * Creates a new ErrorSchema RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ErrorSchema RecordBuilder
   */
  public static ErrorSchema.Builder newBuilder(ErrorSchema.Builder other) {
    if (other == null) {
      return new ErrorSchema.Builder();
    } else {
      return new ErrorSchema.Builder(other);
    }
  }

  /**
   * Creates a new ErrorSchema RecordBuilder by copying an existing ErrorSchema instance.
   * @param other The existing instance to copy.
   * @return A new ErrorSchema RecordBuilder
   */
  public static ErrorSchema.Builder newBuilder(ErrorSchema other) {
    if (other == null) {
      return new ErrorSchema.Builder();
    } else {
      return new ErrorSchema.Builder(other);
    }
  }

  /**
   * RecordBuilder for ErrorSchema instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ErrorSchema>
    implements org.apache.avro.data.RecordBuilder<ErrorSchema> {

    private java.lang.String sourcetype;
    private Event event;
    private Event.Builder eventBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(ErrorSchema.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.sourcetype)) {
        this.sourcetype = data().deepCopy(fields()[0].schema(), other.sourcetype);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.event)) {
        this.event = data().deepCopy(fields()[1].schema(), other.event);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasEventBuilder()) {
        this.eventBuilder = Event.newBuilder(other.getEventBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing ErrorSchema instance
     * @param other The existing instance to copy.
     */
    private Builder(ErrorSchema other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.sourcetype)) {
        this.sourcetype = data().deepCopy(fields()[0].schema(), other.sourcetype);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.event)) {
        this.event = data().deepCopy(fields()[1].schema(), other.event);
        fieldSetFlags()[1] = true;
      }
      this.eventBuilder = null;
    }

    /**
      * Gets the value of the 'sourcetype' field.
      * @return The value.
      */
    public java.lang.String getSourcetype() {
      return sourcetype;
    }


    /**
      * Sets the value of the 'sourcetype' field.
      * @param value The value of 'sourcetype'.
      * @return This builder.
      */
    public ErrorSchema.Builder setSourcetype(java.lang.String value) {
      validate(fields()[0], value);
      this.sourcetype = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'sourcetype' field has been set.
      * @return True if the 'sourcetype' field has been set, false otherwise.
      */
    public boolean hasSourcetype() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'sourcetype' field.
      * @return This builder.
      */
    public ErrorSchema.Builder clearSourcetype() {
      sourcetype = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'event' field.
      * @return The value.
      */
    public Event getEvent() {
      return event;
    }


    /**
      * Sets the value of the 'event' field.
      * @param value The value of 'event'.
      * @return This builder.
      */
    public ErrorSchema.Builder setEvent(Event value) {
      validate(fields()[1], value);
      this.eventBuilder = null;
      this.event = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'event' field has been set.
      * @return True if the 'event' field has been set, false otherwise.
      */
    public boolean hasEvent() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'event' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public Event.Builder getEventBuilder() {
      if (eventBuilder == null) {
        if (hasEvent()) {
          setEventBuilder(Event.newBuilder(event));
        } else {
          setEventBuilder(Event.newBuilder());
        }
      }
      return eventBuilder;
    }

    /**
     * Sets the Builder instance for the 'event' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public ErrorSchema.Builder setEventBuilder(Event.Builder value) {
      clearEvent();
      eventBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'event' field has an active Builder instance
     * @return True if the 'event' field has an active Builder instance
     */
    public boolean hasEventBuilder() {
      return eventBuilder != null;
    }

    /**
      * Clears the value of the 'event' field.
      * @return This builder.
      */
    public ErrorSchema.Builder clearEvent() {
      event = null;
      eventBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ErrorSchema build() {
      try {
        ErrorSchema record = new ErrorSchema();
        record.sourcetype = fieldSetFlags()[0] ? this.sourcetype : (java.lang.String) defaultValue(fields()[0]);
        if (eventBuilder != null) {
          try {
            record.event = this.eventBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("event"));
            throw e;
          }
        } else {
          record.event = fieldSetFlags()[1] ? this.event : (Event) defaultValue(fields()[1]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ErrorSchema>
    WRITER$ = (org.apache.avro.io.DatumWriter<ErrorSchema>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ErrorSchema>
    READER$ = (org.apache.avro.io.DatumReader<ErrorSchema>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.sourcetype);

    this.event.customEncode(out);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.sourcetype = in.readString();

      if (this.event == null) {
        this.event = new Event();
      }
      this.event.customDecode(in);

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.sourcetype = in.readString();
          break;

        case 1:
          if (this.event == null) {
            this.event = new Event();
          }
          this.event.customDecode(in);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}











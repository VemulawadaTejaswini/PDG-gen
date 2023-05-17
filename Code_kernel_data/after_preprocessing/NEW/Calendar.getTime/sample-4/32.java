//32
public class func{
public void serialize(Calendar calendar,BsonGenerator bsonGenerator,SerializerProvider serializerProvider){
    if (calendar == null) {
      serializerProvider.defaultSerializeNull(bsonGenerator);
    } else {
      bsonGenerator.writeDateTime(calendar.getTime());
    }
}
}

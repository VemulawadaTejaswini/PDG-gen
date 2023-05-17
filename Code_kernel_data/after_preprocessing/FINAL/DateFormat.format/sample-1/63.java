public class func{
public void serialize(Date date,Type type,JsonSerializationContext context){
            formatted = primary.format(date);
        return new JsonPrimitive(formatted);
}
}

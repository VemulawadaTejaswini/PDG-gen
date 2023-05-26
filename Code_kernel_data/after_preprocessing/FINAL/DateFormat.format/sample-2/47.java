public class func{
public void serialize(Date value,JsonGenerator gen,SerializerProvider provider){
        DateFormat formatter = new SimpleDateFormat(FORMAT);
        String formattedDate = formatter.format(value);
        gen.writeString(formattedDate);
}
}

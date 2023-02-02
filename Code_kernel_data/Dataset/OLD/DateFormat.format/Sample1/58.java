//57
public class func{
	public void serialize(java.util.Date value,JsonGenerator jgen,SerializerProvider provider){
        DateFormat df = (DateFormat) provider.getConfig().getDateFormat().clone();
        jgen.writeString(df.format(value));
}
}

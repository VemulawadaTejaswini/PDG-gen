//40
public class func{
	public void serializeTimestampAsString(java.sql.Timestamp value){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        return df.format(value);
}
}

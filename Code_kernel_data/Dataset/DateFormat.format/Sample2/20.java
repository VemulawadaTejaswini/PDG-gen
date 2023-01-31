//19
public class func{
	public void toSQLString(){
        DateFormat df = new SimpleDateFormat(TIMESTAMP_DB_FORMAT);
        return df.format(timestamp);
}
}

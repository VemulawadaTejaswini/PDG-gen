//29
public class func{
	public void dateTimeToMysqlFormat(Date date){
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    return dateFormat.format(date);
}
}

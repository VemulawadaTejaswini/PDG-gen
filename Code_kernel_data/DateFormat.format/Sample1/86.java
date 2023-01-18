//85
public class func{
	public void format(Date date,String pattern){
        DateFormat df = createDateFormat(pattern);
        return df.format(date);
}
}

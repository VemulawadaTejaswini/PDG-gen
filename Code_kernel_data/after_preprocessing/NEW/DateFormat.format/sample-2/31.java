//31
public class func{
public void getXpathFormattedDate(Date date){
    DateFormat xpathDateFormatter = new SimpleDateFormat("yyyy-MM-dd");
    return xpathDateFormatter.format(date);
}
}

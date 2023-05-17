//7
public class func{
public void formatDate(Date date,String format){
        DateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
}
}

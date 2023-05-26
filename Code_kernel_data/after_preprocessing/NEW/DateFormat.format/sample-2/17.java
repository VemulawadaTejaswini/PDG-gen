//17
public class func{
public void toDatabaseFormat(java.util.Date date){
        DateFormat format = new SimpleDateFormat(dbFormat);
        return format.format(date);
}
}

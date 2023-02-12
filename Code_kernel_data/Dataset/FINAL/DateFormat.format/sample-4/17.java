public class func{
public void formatDate(java.sql.Timestamp timestamp){
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.FULL);
        return df.format(date);
}
}

public class func{
public void getFormattedDate(Date date){
        DateFormat format = new SimpleDateFormat(FORMAT);
        format.setLenient(false);
        return format.format(date);
}
}

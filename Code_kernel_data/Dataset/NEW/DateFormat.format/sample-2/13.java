//13
public class func{
public void format(Date date,String ptrn){
        java.text.DateFormat format = new java.text.SimpleDateFormat(ptrn);
        return format.format(date);
}
}

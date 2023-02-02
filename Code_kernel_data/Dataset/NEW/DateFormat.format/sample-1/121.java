//121
public class func{
public void javaDateToIso8601(Date date){
        DateFormat formatter = ISO8601Format.get();
        return formatter.format(date);
}
}

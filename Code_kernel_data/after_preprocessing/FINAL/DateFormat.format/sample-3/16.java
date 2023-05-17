public class func{
public void getNiceDate(String dateLongString,String localeString){
        cal.setTimeInMillis(Long.parseLong(dateLongString));
        return df.format(cal.getTime());
}
}

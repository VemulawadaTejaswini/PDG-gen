//49
public class func{
public void formatDate(Date value,String strFormat){
    DateFormat df = new SimpleDateFormat( strFormat );
    return df.format( value );
}
}

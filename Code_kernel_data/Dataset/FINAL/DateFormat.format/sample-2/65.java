public class func{
public void fromUTCtoURIDate(String utc){
        DateFormat uriFormat = new SimpleDateFormat("yyyy'-'MM'-'dd'-'HH'-'mm");
        return uriFormat.format(utcDate);
}
}

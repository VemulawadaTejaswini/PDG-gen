public class func{
public void UTCtoURIDate(String utc){
    DateFormat uriFormat = new SimpleDateFormat("yyyy'-'MM'-'dd'-'HH'-'mm");
    return uriFormat.format(utcDate);
}
}

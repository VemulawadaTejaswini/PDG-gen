public class func{
public void formatExample(String formatString,Date sampleDate){
    formatter.setTimeZone(getTimeZone());
    return formatter.format(sampleDate);
}
}

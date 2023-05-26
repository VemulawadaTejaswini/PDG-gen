public class func{
public void dateQueryString(Calendar start,Calendar end){
        String formattedEnd = dateFormat.format(end.getTime());
        return String.format("start=%s&end=%s", formattedStart, formattedEnd);
}
}

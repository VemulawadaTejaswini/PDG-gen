public class func{
public void formatBuildTime(Date buildTime){
        format.setTimeZone(TimeZone.getTimeZone("UTC"));
        return format.format(buildTime);
}
}

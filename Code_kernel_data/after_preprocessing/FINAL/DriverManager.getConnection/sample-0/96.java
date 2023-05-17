public class func{
public void nextConnection(String url){
        props.setProperty(PhoenixRuntime.CURRENT_SCN_ATTRIB, Long.toString(nextTimestamp()));
        return DriverManager.getConnection(url, props);
}
}

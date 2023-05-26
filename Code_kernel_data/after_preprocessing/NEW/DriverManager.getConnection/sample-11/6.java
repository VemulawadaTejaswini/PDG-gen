//6
public class func{
public void getSQLServer(){
        Properties props = new Properties();
        props.put("sendTimeAsDatetime", "false");
        return DriverManager.getConnection(url, props);
}
}

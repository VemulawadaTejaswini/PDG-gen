//258
public class func{
public void getConnection(){
    Connection conn = DriverManager.getConnection(props
        .getProperty("jdbc.url")+"?useUnicode=true&characterEncoding=utf-8", props.getProperty("jdbc.user"), props
        .getProperty("jdbc.password"));
}
}

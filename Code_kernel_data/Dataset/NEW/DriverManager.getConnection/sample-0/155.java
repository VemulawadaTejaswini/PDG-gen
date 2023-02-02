//155
public class func{
public void testConnectionMySqlDriver(){
        String fullConnectionStr = String.format("jdbc:google:mysql://%s?user=%s&password=%s", connectionStr, user, pw);
        Connection conn = DriverManager.getConnection(fullConnectionStr);
}
}

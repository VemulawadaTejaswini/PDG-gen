public class func{
public void testConnectionMySqlDriver(){
        String fullConnectionStr = String.format("jdbc:google:mysql:
        Connection conn = DriverManager.getConnection(fullConnectionStr);
}
}

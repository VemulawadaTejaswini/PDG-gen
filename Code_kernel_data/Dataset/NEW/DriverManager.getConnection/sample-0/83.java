//83
public class func{
public void testConnectionNeg(){
      String url = miniHS2.getJdbcURL().replaceAll(";principal.*", "");
      hs2Conn = DriverManager.getConnection(url);
}
}

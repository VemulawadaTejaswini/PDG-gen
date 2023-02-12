public class func{
public void testPreparedError1(){
    PreparedStatement stmt = conn.prepareStatement("select");
      stmt.executeQuery();
}
}

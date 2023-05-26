public class func{
public void testExecuteQueryWithoutParameters(){
    PreparedStatement pstmt = conn.prepareStatement("INSERT INTO streamtable (bin,str) VALUES (?,?)");
      pstmt.executeQuery();
}
}

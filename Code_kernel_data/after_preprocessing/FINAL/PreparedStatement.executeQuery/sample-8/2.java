public class func{
public void testImplicitPortalClosing(){
    PreparedStatement s = conn.prepareStatement("select 1");
    s.executeQuery();
}
}

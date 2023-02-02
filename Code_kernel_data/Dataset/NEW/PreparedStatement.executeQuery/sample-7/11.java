//11
public class func{
public void testViewParameters(){
        PreparedStatement prep = conn.prepareStatement(
                "select 1 from test where name=? and value=? and value<=?");
        prep.setString(1, "x");
        prep.setInt(3, 1);
        prep.executeQuery();
}
}

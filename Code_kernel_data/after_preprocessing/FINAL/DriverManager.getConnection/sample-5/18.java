public class func{
public void testFamilyNameInPK(){
        Connection conn = DriverManager.getConnection(getUrl());
            PreparedStatement statement = conn.prepareStatement(query);
            statement.execute();
}
}

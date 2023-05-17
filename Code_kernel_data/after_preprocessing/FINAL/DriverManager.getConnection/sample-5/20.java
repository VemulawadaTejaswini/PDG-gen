public class func{
public void testUnknownFamilyNameInTableOption(){
        Connection conn = DriverManager.getConnection(getUrl());
            PreparedStatement statement = conn.prepareStatement(query);
            statement.execute();
}
}

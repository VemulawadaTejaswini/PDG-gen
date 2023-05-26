//11
public class func{
public void testMultiPKDef(){
        Connection conn = DriverManager.getConnection(getUrl());
            PreparedStatement statement = conn.prepareStatement(query);
            statement.execute();
}
}

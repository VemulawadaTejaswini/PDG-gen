//12
public class func{
public void testNoPK(){
        Connection conn = DriverManager.getConnection(getUrl());
            PreparedStatement statement = conn.prepareStatement(query);
            statement.execute();
}
}

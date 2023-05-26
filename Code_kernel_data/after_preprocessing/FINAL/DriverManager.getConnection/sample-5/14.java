public class func{
public void testInvalidArraySize(){
        Connection conn = DriverManager.getConnection(getUrl());
            PreparedStatement statement = conn.prepareStatement(query);
            statement.execute();
}
}

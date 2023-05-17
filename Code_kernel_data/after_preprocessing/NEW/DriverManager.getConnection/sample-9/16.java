//16
public class func{
public void testQueriesUsingExecuteUpdateShouldFail(){
        Connection connection = DriverManager.getConnection(getUrl(), connectionProperties);
        PreparedStatement stmt = connection.prepareStatement("SELECT * FROM " + ATABLE);
            stmt.executeUpdate();
}
}

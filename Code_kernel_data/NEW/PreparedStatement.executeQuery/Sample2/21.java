//20
public class func{
	public void testMutationUsingExecuteQueryShouldFail(){
        Connection connection = DriverManager.getConnection(getUrl(), connectionProperties);
        PreparedStatement stmt = connection.prepareStatement("DELETE FROM " + ATABLE);
            stmt.executeQuery();
}
}

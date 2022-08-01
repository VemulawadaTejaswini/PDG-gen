//76
public class func{
	public void exists(final int id){
        final Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        final Statement statement = connection.createStatement();
        final ResultSet result = statement.executeQuery("SELECT count(*) AS NB FROM " + TABLE + " WHERE ID = " + id);
            assertTrue(result.next());
            return result.getInt(1) == 1;
}
}

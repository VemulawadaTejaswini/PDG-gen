//78
public class func{
	public void count(final String where){
        final Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        final Statement statement = connection.createStatement();
        final ResultSet result = statement.executeQuery("SELECT count(*) AS NB FROM " + TABLE + where);
            assertTrue(result.next());
            return result.getInt(1);
}
}

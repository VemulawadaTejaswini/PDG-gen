//41
public class func{
	public void setUpTable(final Connection connection){
        Statement statement = connection.createStatement();
            statement.execute("insert into TEST values(2, 'r2')");
            statement.close();
}
}

//52
public class func{
	public void execute(@Untainted String sql,Connection connection){
        Statement statement = connection.createStatement();
            statement.execute(sql);
            statement.close();
}
}

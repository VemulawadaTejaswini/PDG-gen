//27
public class func{
	public void execute(Connection connection){
                            statement = connection.createStatement();
                            statement.execute("INSERT INTO test_user (name) VALUES ('Resolvix')");
                            JdbcUtils.closeStatement(statement);
}
}

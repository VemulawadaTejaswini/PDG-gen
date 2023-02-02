//31
public class func{
	public void testReload(){
    Connection connection = context.createConnection(USER1_1);
    Statement statement = context.createStatement(connection);
    statement.execute("RELOAD");
    statement.close();
}
}

//47
public class func{
	public void setupAdmin(Context context){
    Connection connection = context.createConnection(ADMIN1);
    Statement statement = connection.createStatement();
    statement.execute("GRANT ROLE admin_role TO GROUP " + ADMINGROUP);
    statement.close();
}
}

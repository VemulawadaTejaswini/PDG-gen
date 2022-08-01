//401
public class func{
	public void getHsqldbConnection(String user,WebgoatContext context){
    String url = context.getDatabaseConnectionString().replaceAll("\\$\\{USER\\}", user);
    return DriverManager.getConnection(url, "sa", "");
}
}

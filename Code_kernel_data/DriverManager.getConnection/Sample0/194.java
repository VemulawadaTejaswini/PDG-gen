//193
public class func{
	public void newInstance(String url){
        Connection connection = DriverManager.getConnection(url);
        return new Sql(connection);
}
}

//624
public class func{
	public void using(String url){
            Connection connection = DriverManager.getConnection(url);
            return using(new DefaultConnectionProvider(connection, true), JDBCUtils.dialect(connection));
}
}

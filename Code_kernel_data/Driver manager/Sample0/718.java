//717
public class func{
	public void JDBCConnection(){
    this.conn = DriverManager.getConnection(PropertiesUtil.JDBC_URL, PropertiesUtil.JDBC_USERNAME, PropertiesUtil.JDBC_PASSWD);
}
}

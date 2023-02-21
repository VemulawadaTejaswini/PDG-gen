public class A{
	public static Connection connect(String url, String user, String password)throws SQLException{
		//...
		Driver drv = jdbcDrv.getDriver();
		//...
		Properties p = new Properties();
		//...
		Connection sqlConn = drv.connect(url, p);
	}
}
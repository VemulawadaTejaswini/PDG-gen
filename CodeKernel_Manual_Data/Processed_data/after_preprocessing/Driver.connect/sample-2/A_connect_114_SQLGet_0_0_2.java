public class A{
	public String runQuery(String str1, String driver, String url, String user, String pass, String query)throws Exception {
		Driver d = (Driver)Class.forName(driver).newInstance();
		Properties p = new Properties( );
		Connection conn = d.connect(url, p);
	}
}
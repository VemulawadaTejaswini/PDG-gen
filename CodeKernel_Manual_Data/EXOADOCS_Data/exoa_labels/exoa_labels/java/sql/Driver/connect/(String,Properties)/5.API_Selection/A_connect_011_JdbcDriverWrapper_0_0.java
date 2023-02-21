public class A{
	public Connection connect(String url,Properties properties)throws SQLException{
		return this.driver.connect(url,properties);
	}
}
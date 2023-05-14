public class A{
	public Connection connect(String url, Properties info)throws SQLException {
		return this.driver.connect(url, info);
	}
}
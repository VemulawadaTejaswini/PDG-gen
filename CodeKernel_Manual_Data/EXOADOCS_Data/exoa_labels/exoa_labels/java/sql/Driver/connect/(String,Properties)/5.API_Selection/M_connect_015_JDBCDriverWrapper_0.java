public class A{
	public Connection connect(String u, Properties p) throws SQLException {
		return this.driver.connect(u, p);
	}
}
public class A{
	public BottomlineConnection(String url, Properties props)throws BottomlineException, SQLException {
		//...
		Driver driver = null;
		//...
		conn = driver.connect(url.replaceFirst("jdbc:bottomline:", "jdbc:"),props);
	}
}
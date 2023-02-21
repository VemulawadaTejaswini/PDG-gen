public class A{
	public Connection connect(String url, Properties properties) throws SQLException {
		setLastDriverUsed(getClass());
		if (EXCEPTION_URL.equals(url)) {
			throw new SQLException(CONNECT_EXCEPTION_MESSAGE);
		}
		return super.connect(url, properties);
	}
}
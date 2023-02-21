public class A{
	public Connection connect(String url, Properties info) throws SQLException {
		JPURL st = JPURL.parseURLCached(url);
		if (st == null)throw new SQLException("Connection URL isn't accepted");
		Driver d = st.getTargetDriver();
		if (d == null)throw new SQLException("Cannot find target driver: " + st.targetURL);
		logger.info("Connect to Target-URL: " + st.targetURL);
		Connection c = d.connect(st.targetURL, info);
		return new JPConnection(c, st.getInterceptor());
	}
}
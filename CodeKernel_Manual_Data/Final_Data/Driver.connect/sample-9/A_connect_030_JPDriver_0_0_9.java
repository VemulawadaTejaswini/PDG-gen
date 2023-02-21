public class A{
	public Connection connect(String url, Properties info) throws SQLException {
		//...
		Driver d = st.getTargetDriver();
		//...
		Connection c = d.connect(st.targetURL, info);
	}
}
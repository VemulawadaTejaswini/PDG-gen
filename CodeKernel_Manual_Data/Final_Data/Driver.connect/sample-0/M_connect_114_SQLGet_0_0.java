public class A{
	public String runQuery(String str1, String driver, String url, String user, String pass, String query)throws Exception {
		String output = "";
		Driver d = (Driver)Class.forName(driver).newInstance();
		Properties p = new Properties( );
		p.setProperty("user", user);
		p.setProperty("password", pass);
		Connection conn = d.connect(url, p);
		query = fixQuery(query, str1, "%1");
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			if (rs.next()) {
				output = rs.getObject(1).toString();
			} else {
				output = "";
			}
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} finally {
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} finally {
				}
				stmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} finally {
				}
			}
		}
		return output;
	}
}
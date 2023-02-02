//184
public class func{
	public void addDatabaseUserWithPassword(){
        Connection conn = DriverManager.getConnection(DATASOURCE_URL, "sa", "");
        conn.setAutoCommit(true);
        Statement st = conn.createStatement();
        st.executeUpdate("CREATE USER " + USER + " PASSWORD '" + PASSWORD + "';");
        st.close();
}
}

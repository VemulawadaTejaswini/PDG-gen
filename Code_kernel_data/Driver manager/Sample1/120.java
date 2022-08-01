//119
public class func{
	public void createDB(){
        Connection conn = DriverManager.getConnection(getLocalJdbcUri(), "sa", "");
        Statement st = conn.createStatement();
        st.executeUpdate("INSERT INTO TT (I, S) VALUES (3, 'a')");
        st.close();
}
}

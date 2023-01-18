//30
public class func{
	public void createDatabase(){
        Connection conn = getConnection();
        conn.setAutoCommit(false);
        Statement st = conn.createStatement();
        st.execute("DROP TABLE T1");
}
}

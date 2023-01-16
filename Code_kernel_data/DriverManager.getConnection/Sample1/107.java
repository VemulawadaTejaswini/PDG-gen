//106
public class func{
	public void testConnectRepeatedly(){
        con.close();
        con = DriverManager.getConnection(url);
        st = con.createStatement();
        JDBC.assertSingleValueResultSet(st.executeQuery("values 1"), "1");
        st.close();
}
}

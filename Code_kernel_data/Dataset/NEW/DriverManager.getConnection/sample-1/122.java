//122
public class func{
public void testConnectRepeatedly(){
        Connection con = DriverManager.getConnection(url);
        Statement st = con.createStatement();
        JDBC.assertSingleValueResultSet(st.executeQuery("values 1"), "1");
        st.close();
}
}

public class func{
public void testUsePreparedStatement(){
        Connection conn = proxyDataSource.getConnection();
        PreparedStatement st = conn.prepareStatement("select * from emp");
        st.executeQuery();
}
}

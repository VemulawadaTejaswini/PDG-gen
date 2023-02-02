//112
public class func{
public void execSQL(String sql){
        Connection conn = DriverManager.getConnection(url, "sa", "");
        Statement st = conn.createStatement();
        st.executeUpdate(sql);
        st.close();
}
}

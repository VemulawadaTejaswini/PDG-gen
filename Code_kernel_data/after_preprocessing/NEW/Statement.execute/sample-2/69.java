//69
public class func{
public void runSQL(String sql,Connection cx){
        Statement st = cx.createStatement();
            st.execute(sql);
            close(st);
}
}

public class func{
public void truncate(Connection con){
            st = con.createStatement();
            st.execute(sql);
            close(st);
}
}

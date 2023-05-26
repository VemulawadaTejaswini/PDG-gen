public class func{
public void shutdown(){
        Statement st = conn.createStatement();
        st.execute("SHUTDOWN");
}
}

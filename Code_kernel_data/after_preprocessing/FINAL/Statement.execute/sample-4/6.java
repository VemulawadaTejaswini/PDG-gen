public class func{
public void shutdown(){
    Statement st = connection.createStatement();
    st.execute("SHUTDOWN");
}
}

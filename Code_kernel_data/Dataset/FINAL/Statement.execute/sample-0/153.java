public class func{
public void commit(){
            st = createStatement();
            st.execute("CHECKPOINT");
}
}

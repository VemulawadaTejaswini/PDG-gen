//61
public class func{
public void initializeConnection(Connection cx){
        Statement st = cx.createStatement();
        st.execute("set lockmode session where level=mvcc");
}
}

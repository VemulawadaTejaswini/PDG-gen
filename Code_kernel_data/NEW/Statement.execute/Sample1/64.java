//63
public class func{
	public void tearDown(){
            Statement st = HsqlConn.createStatement();
            st.execute("SHUTDOWN");
            st.close();
}
}

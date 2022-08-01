//14
public class func{
	public void tearDown(){
            st = conn.createStatement();
            st.execute("drop table if exists type");
                st.close();
}
}

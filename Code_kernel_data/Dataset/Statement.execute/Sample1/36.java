//35
public class func{
	public void setUp(){
        Statement st = cx.createStatement();
        st.execute("DROP TABLE IF EXISTS noindex");
        st.close();
}
}

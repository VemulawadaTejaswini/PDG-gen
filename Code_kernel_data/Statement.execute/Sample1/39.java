//38
public class func{
	public void setUp(){
        Statement st = createStatement();
        st.execute("create table lobTable100M(bl blob(100M))");
        st.close();
}
}

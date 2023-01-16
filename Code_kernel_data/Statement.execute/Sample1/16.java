//15
public class func{
	public void setUp(){
        Statement st = conn.createStatement();
        st.execute(DatabaseCreator.CREATE_TABLE_SIMPLE1);
        st.close();
}
}

//58
public class func{
	public void tearDown(){
        Statement st = createStatement();
        st.execute("DROP TABLE TEST_TABLE");
        st.close();
}
}

//21
public class func{
	public void tearDown(){
        Statement st = createStatement();
        st.executeUpdate("DROP FUNCTION PADSTRING");
        st.execute("drop view tran_table");
        st.close();
}
}

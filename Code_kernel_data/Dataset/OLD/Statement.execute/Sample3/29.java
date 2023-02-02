//28
public class func{
	public void createConnection(){
    Statement st = conn.createStatement();
      st.execute("SET TIME ZONE '"+dbTimezone+"'");
    st.close();
}
}

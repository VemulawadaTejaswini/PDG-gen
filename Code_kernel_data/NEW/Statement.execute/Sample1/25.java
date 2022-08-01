//24
public class func{
	public void checkConnection(){
      Statement st = getConnection().createStatement();
         st.execute("SELECT true");
         st.close();
}
}

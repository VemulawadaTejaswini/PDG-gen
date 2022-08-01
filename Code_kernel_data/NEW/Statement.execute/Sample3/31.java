//30
public class func{
	public void executeDDL(Connection con,String ddl){
        Statement st = con.createStatement();
            st.execute(ddl);
            st.close();
}
}

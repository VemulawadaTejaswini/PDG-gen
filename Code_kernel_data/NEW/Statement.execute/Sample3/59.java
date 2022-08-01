//58
public class func{
	public void testCreateTestTable(){
        Connection con = datasource.getConnection();
        Statement st = con.createStatement();
            st.execute("create table test(id int not null, val1 varchar(255), val2 varchar(255), val3 varchar(255), val4 varchar(255))");
        st.close();
}
}

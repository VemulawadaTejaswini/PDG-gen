//56
public class func{
	public void setUp(){
            Connection con = getConnection();
            Statement stmt = con.createStatement();
            stmt.execute("create table ClobTestData (" +
                    "id int unique, dClob CLOB)");
            stmt.executeUpdate("insert into ClobTestData values (1, '')");
            stmt.close();
}
}

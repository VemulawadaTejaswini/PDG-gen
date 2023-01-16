//34
public class func{
	public void executeSQL(Connection con,String sql){
        Statement stmt = con.createStatement();
        stmt.execute(sql);
        return stmt.getResultSet();
}
}

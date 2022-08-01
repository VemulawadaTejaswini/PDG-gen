//112
public class func{
	public void run(Connection conn){
        PreparedStatement stmt = this.getPreparedStatement(conn, minStmt);
        ResultSet r=stmt.executeQuery();
        while(r.next())
        {
          minId = r.getInt(1);
        }
        r.close();
}
}

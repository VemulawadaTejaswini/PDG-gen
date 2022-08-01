//12
public class func{
	public void createSchemaObjects(Connection conn){
    Statement stmt = conn.createStatement ();
      stmt.execute ("drop table jdbc_demo_lob_table");
    stmt.execute (sql);
    stmt.close();
}
}

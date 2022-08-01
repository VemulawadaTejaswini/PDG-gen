//4
public class func{
	public void testShowPlan(){
    Statement s = conn.createStatement();
    assertFalse(s.execute("SET SHOWPLAN ON"));
    assertTrue(s.execute("SELECT 1"));
    assertTrue(s.execute("SHOW PLAN"));
    ResultSet rs = s.getResultSet();
    assertTrue(rs.next());
    String str = rs.getString(1);
    assertTrue(str.startsWith("ProjectNode\n  + Relational Node ID:0\n  + Output Columns:expr1 (integer)\n  + Statistics:\n    0: Node Output Rows: 1"));
}
}

//79
public class func{
	public void testWarningsAreCleared(){
        Statement stmt = con.createStatement();
        stmt.execute("CREATE TEMP TABLE unused (a int primary key)");
        stmt.executeQuery("SELECT 1");
        assertNull(stmt.getWarnings());
        stmt.close();
}
}

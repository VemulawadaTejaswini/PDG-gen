//55
public class func{
	public void setupDatabase(Connection con){
        Statement stmt = con.createStatement();
        stmt.execute("CREATE TABLE " + TABLE_INDEX
                + "(name text, statement text, category text)");
}
}

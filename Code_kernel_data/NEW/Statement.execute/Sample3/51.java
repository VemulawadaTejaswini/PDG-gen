//50
public class func{
	public void doSomeChanges(Connection conn){
    Statement otherStmt = conn.createStatement ();
    otherStmt.execute ("commit");
    otherStmt.close ();
}
}

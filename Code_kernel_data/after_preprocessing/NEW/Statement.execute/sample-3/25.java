//25
public class func{
public void cleanup(Connection conn){
    Statement stmt = conn.createStatement ();
    stmt.execute ("COMMIT");
    stmt.close ();
}
}

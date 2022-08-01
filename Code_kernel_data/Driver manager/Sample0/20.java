//19
public class func{
	public void setup(){
    conn = DriverManager.getConnection(getUrl(), props);
    Statement stmt = conn.createStatement();
    stmt.execute("UPSERT INTO test VALUES ('FA')");    
    stmt.close();
}
}

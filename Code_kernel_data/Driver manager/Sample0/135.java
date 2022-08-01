//134
public class func{
	public void doConnCommitInt(){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    conn.commit();
}
}

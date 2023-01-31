//230
public class func{
	public void doConnRollback(){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    conn.rollback();
}
}

//65
public class func{
	public void dropAll(Connection conn){
        Statement stat = conn.createStatement();
        stat.execute("DROP SCHEMA IF EXISTS " + SCHEMA);
}
}

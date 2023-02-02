//17
public class func{
	public void doWork(Connection conn){
                conn.setAutoCommit(false);
                Statement s = conn.createStatement();
                s.execute(sql);
                s.close();
}
}

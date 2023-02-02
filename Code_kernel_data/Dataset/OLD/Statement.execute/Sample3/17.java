//16
public class func{
	public void perf(){
            Connection conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
            stmt.execute("SELECT " + i % 1000);
            stmt.close();
}
}

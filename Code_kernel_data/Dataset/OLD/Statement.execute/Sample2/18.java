//17
public class func{
	public void execute(String sql){
            conn = dataSource.getConnection();
            stmt = conn.createStatement();
            stmt.execute(sql);
            JdbcUtils.close(conn);
}
}

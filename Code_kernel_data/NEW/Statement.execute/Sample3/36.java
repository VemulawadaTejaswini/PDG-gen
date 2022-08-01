//35
public class func{
	public void dropTable(){
        Connection conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
            stmt.execute("DROP TABLE t_big");
            stmt.close();
}
}

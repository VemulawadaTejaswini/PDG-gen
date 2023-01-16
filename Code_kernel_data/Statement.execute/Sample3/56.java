//55
public class func{
	public void execute(String sql,Connection connection){
            stmt = connection.createStatement();
            stmt.execute(sql);
            if (stmt != null) {
                stmt.close();
            }
}
}

//66
public class func{
	public void currentPatches(String database){
        Connection conn = DriverManager.getConnection("jdbc:hsqldb:mem:orders", "sa", "");
        Statement stmt = conn.createStatement();
        ResultSet resultSet = stmt.executeQuery("SELECT * FROM patches");
        while (resultSet.next()) {
            log.info("Result " + resultSet.getInt(2));
        }
        SqlUtil.close(conn, stmt, null);
}
}

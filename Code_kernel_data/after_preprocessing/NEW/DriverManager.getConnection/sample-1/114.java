//114
public class func{
public void executeSql(String sql){
            DriverManager.getConnection(
                "jdbc:default:connection");
        Statement stmt = conn.createStatement();
        if (stmt.execute(sql)) {
            ResultSet rs = stmt.getResultSet();
            rs.next();
            return rs.getString(1);
        } else {
            return Integer.toString(stmt.getUpdateCount());
        }
}
}

public class func{
public void selectRows(String table,ResultSet[] rs){
        Connection conn = DriverManager.getConnection("jdbc:default:connection");
        Statement stmt = conn.createStatement();
        rs[0] = stmt.executeQuery("SELECT * FROM " + table);
}
}

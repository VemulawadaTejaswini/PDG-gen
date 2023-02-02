//24
public class func{
public void nullEncoding(){
    Connection conn = DriverManager.getConnection(getUrl());
    conn.createStatement().execute(ddl);
    ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM test_table WHERE some_column = DECODE('8', NULL)");
    assertFalse(rs.next());
}
}

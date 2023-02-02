//83
public class func{
public void shouldPingDatabase(){
    Connection conn = DriverManager.getConnection("jdbc:derby:memory:chapter02DB;create=true", "APP2", "APP");
    conn.createStatement().executeQuery("SELECT 1 FROM SYSIBM.SYSDUMMY1");
}
}

//131
public class func{
public void testInit(){
        deleteDb("databaseEventListener");
        String url = getURL("databaseEventListener", true);
        url += ";DATABASE_EVENT_LISTENER='" + Init.class.getName() + "'";
        Connection conn = DriverManager.getConnection(url, "sa", "sa");
        Statement stat = conn.createStatement();
        stat.execute("select * from test");
}
}

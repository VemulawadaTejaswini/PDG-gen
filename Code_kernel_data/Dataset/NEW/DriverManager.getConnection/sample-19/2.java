//2
public class func{
public void loadData(long ts){
        props.setProperty(PhoenixRuntime.CURRENT_SCN_ATTRIB, Long.toString(ts));
        Connection conn = DriverManager.getConnection(PHOENIX_JDBC_URL, props);
        insertRow(conn, "SOQL4", 30);
        conn.commit();
        conn.close();
}
}

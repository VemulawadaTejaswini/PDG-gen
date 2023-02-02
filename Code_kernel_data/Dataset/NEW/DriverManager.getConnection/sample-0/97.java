//97
public class func{
public void testGroupByCase(){
        props.setProperty(PhoenixRuntime.CURRENT_SCN_ATTRIB, Long.toString(ts + 1));
        Connection conn = DriverManager.getConnection(PHOENIX_JDBC_URL, props);
            gbt.executeQuery(conn,GROUPBY3);
}
}

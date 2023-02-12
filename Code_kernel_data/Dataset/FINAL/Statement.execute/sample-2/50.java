public class func{
public void testReadOnlyConnect(){
        deleteDb("readonlyConnect");
        Connection conn = getConnection("readonlyConnect;OPEN_NEW=TRUE");
        Statement stat = conn.createStatement();
        stat.execute("insert into test select x from system_range(1, 11)");
}
}

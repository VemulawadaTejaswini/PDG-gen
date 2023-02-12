public class func{
public void doBeforeTestSetup(){
        ensureTableCreated(getUrl(), GROUPBYTEST_NAME);
        Connection conn = DriverManager.getConnection(getUrl());
        insertRow(conn, "Report3?2", 30);
        conn.commit();
        conn.close();
}
}

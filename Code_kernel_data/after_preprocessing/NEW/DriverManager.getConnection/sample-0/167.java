//167
public class func{
public void testDividend(long dividend){
        Connection conn = DriverManager.getConnection(getUrl());
        initTable(conn, dividend);
}
}

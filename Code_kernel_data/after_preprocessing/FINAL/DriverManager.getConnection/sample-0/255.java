public class func{
public void testGroupByScanWithRegexpSubstr(){
        Connection conn = DriverManager.getConnection(getUrl());
        testGroupByScanWithRegexpSubstr(conn, null, "Report");
}
}

//62
public class func{
public void testOverallQueryMetricsForSelect(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
}
}

public class func{
public void nullInFirstTimezoneParameter(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
        conn.createStatement().execute(dml);
}
}

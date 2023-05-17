public class func{
public void closingDatabase(){
            conn = DriverManager.getConnection(databaseUrl, getUser(), getPassword());
            conn.createStatement().execute("DROP TABLE TEST2");
}
}

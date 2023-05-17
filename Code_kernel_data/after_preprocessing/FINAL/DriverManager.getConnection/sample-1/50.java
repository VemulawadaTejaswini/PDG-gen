public class func{
public void opened(){
            conn = DriverManager.getConnection(databaseUrl, getUser(), getPassword());
            conn.createStatement().execute("CREATE TABLE IF NOT EXISTS TEST2(ID INT)");
}
}

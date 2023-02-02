//124
public class func{
public void destroyDatabase(String database){
        Connection conn = DriverManager.getConnection("jdbc:hsqldb:mem:" + database, "sa", "");
        Statement stmt = conn.createStatement();
        stmt.execute("SHUTDOWN");
}
}

//62
public class func{
public void initDatabaseAccess(Connection con){
        Statement stmt = con.createStatement();
        stmt.execute("CREATE ALIAS IF NOT EXISTS NOW_MILLIS FOR \"java.lang.System.currentTimeMillis\";");
}
}

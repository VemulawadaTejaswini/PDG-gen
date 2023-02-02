//76
public class func{
public void shutdown(){
                Statement stmt = dbconn.createStatement();
                stmt.execute("SHUTDOWN;");
}
}

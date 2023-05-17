//8
public class func{
public void ensureConnection(){
        if (databaseUrl != null) {
          conn = DriverManager.getConnection(databaseUrl);
        }
}
}

public class func{
public void getConnection(String dbUrl,Properties properties){
      pw.println("[NsSampleWork] Thread id - "+thread_id + "; requests database connection, dbUrl ="+dbUrl);
      conn = DriverManager.getConnection(dbUrl, properties);
}
}

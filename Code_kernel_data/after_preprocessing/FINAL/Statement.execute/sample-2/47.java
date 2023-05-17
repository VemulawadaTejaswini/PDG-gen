public class func{
public void initializeConnection(Connection connection){
    Statement stmt = connection.createStatement();
      stmt.execute("ALTER SESSION SET NLS_TIMESTAMP_FORMAT = 'SYYYY-MM-DD HH24:MI:SS'");
}
}

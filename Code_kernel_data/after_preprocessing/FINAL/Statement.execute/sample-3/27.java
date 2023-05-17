public class func{
public void changeDbCharset(String dbHost,String dbPort,String dbName,String dbUser,String dbPassword){
    Connection conn = getConn(dbHost, dbPort, dbName, dbUser, dbPassword);
    Statement stat = conn.createStatement();
    stat.execute(sql);
    stat.close();
}
}

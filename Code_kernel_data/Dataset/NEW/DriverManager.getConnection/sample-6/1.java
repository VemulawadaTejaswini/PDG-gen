//1
public class func{
public void openConnection(){
       Connection c = DriverManager.getConnection(url);
       c.setAutoCommit(true);
       connectionPool.push(c);
}
}

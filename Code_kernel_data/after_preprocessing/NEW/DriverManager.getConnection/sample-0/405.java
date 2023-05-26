//405
public class func{
public void ConnectionPool(){
                    conn = DriverManager.getConnection(url, username, password);
                    pool.add(conn);
}
}

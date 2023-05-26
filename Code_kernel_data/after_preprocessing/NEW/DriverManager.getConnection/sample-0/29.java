//29
public class func{
public void setUp(){
        conn = DriverManager.getConnection(url, "querydsl", "querydsl");
        stmt = conn.createStatement();
}
}

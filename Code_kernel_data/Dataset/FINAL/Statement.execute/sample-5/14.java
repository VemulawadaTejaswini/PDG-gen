public class func{
public void testPostgreSQL(){
        Statement stat = conn.createStatement();
        stat.execute("SET MODE PostgreSQL");
}
}

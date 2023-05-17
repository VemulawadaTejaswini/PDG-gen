public class func{
public void setUp(){
    Statement stmt = createStatement();
    stmt.executeUpdate("create table t1 (c11 int, c12 smallint, c13 double, c14 char(3))");
    stmt.execute("insert into t2 values (-1),(-2)");
    stmt.close();
}
}

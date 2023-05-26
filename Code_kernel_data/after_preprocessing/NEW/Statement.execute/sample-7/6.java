//6
public class func{
public void decorateSQL(Statement stmt){
                stmt.execute("create table t (i int)");
                stmt.executeUpdate("insert into t values (3)");
}
}

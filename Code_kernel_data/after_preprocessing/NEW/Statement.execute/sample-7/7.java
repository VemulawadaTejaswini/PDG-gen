//7
public class func{
public void decorateSQL(Statement stmt){
                stmt
                        .execute("create table tab1 (COL1 int, COL2 smallint, COL3 real)");
                stmt.executeUpdate("insert into tab1 values(2, 2, 3.1)");
}
}

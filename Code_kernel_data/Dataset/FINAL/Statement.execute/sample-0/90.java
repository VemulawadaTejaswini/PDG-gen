public class func{
public void decorateSQL(Statement stmt){
                stmt.execute("create table " + LONGVARCHAR  +
                        " (sno int, dLongVarchar LONG VARCHAR)");
}
}

public class func{
public void decorateSQL(Statement s){
                s.execute("create table setMaxFieldSize(id int unique, " +
                        "dVarchar VARCHAR(32672), dClob clob)");
}
}

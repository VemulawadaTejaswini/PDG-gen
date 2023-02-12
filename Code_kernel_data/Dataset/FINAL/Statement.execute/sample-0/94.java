public class func{
public void decorateSQL(Statement s){
                s.execute("create table TEST_TABLE( TEST_COL blob( 65536 ))");
}
}

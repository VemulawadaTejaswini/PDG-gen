//114
public class func{
public void decorateSQL(Statement s){
        s.execute("CREATE UNIQUE INDEX " +tableName +"x on "+ tableName+"(i1,i3)");
}
}

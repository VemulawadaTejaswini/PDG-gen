public class func{
public void decorateSQL(Statement stmt){
        stmt.execute("create view tab1_view (a,b) as select y,y+1 from tab1");
}
}

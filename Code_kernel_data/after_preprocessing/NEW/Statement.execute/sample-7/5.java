//5
public class func{
public void setUp(){
        Statement stmt = createStatement();
        stmt.execute("create table tab1 (i integer)");
        stmt.executeUpdate("alter table tab1 add constraint con1 unique (i)");
}
}

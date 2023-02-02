//34
public class func{
public void setUp(){
        Statement stmt = createStatement();
        stmt.execute ("create table testblob (data blob)");
        stmt.close();
}
}

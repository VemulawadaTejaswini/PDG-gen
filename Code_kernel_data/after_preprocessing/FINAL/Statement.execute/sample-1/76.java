public class func{
public void setUp(){
        Statement stmt = createStatement ();
        stmt.execute ("create table updateClob " +
                "(id integer primary key, data clob)");
        stmt.close();
}
}

public class func{
public void setUp(){
        Connection con = getConnection();
        Statement stmt = con.createStatement();
        stmt.execute ("create table blobtest (id integer, data Blob)");
        stmt.close();
}
}

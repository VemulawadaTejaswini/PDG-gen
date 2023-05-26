public class func{
public void tearDown(){
        Connection con = getConnection();
        con.setAutoCommit (true);
        Statement stmt = con.createStatement();
        stmt.execute ("drop table blobtest");
        stmt.close();
}
}

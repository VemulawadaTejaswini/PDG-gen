public class func{
public void tearDown(){
        con.setAutoCommit(true);
        Statement stmt = con.createStatement ();
        stmt.execute ("drop FUNCTION testspg__getEmptyRefcursor ();");
}
}

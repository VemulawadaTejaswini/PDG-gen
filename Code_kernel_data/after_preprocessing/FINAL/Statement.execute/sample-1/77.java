public class func{
public void testStatementCopyOut(){
        Statement stmt = con.createStatement();
            stmt.execute("COPY copytest TO STDOUT");
        stmt.close();
}
}

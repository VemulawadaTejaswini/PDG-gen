//0
public class func{
public void tearDown(){
        Statement stmt = con.createStatement();
        stmt.execute("drop function myif(a INOUT int, b IN int)");
        stmt.close();
}
}

public class func{
public void tearDown(){
        Statement stmt = createStatement();
        stmt.execute("drop table app.t1");
        stmt.close();
}
}

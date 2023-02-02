//39
public class func{
public void tearDown(){
        Statement stmt = createStatement();
        stmt.execute("drop table GR_TAB");
        stmt.close();
}
}

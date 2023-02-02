//21
public class func{
public void testRunscriptFromClasspath(){
        deleteDb("runscript");
        conn = getConnection("runscript");
        Statement stat = conn.createStatement();
        stat.execute("select * from version");
}
}

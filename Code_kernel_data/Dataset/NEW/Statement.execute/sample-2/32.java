//32
public class func{
public void testReferenceableIndexUsage(){
        Connection conn = getConnection("cases");
        Statement stat = conn.createStatement();
        stat.execute("drop table if exists a, b");
}
}

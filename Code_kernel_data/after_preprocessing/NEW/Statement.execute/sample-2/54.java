//54
public class func{
public void testSortedSelect(){
        deleteDb("cases");
        Connection conn = getConnection("cases");
        Statement stat = conn.createStatement();
        stat.execute("drop table test");
}
}

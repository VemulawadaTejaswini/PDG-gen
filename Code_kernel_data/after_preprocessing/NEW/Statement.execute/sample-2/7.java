//7
public class func{
public void testDeleteGroup(){
        deleteDb("cases");
        Connection conn = getConnection("cases");
        Statement stat = conn.createStatement();
        stat.execute("delete from test where id not in " +
                "(select min(x) from test group by id)");
}
}

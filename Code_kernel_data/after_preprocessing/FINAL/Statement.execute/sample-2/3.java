public class func{
public void testCountDistinctNotNull(){
        deleteDb("cases");
        Connection conn = getConnection("cases");
        Statement stat = conn.createStatement();
        stat.execute("create table test(id int not null) as " +
                "select 1 from system_range(1, 10)");
        ResultSet rs = stat.executeQuery("select count(distinct id) from test");
        rs.next();
        assertEquals(1, rs.getInt(1));
        conn.close();
}
}

//23
public class func{
public void testCreateAsSelect(){
        deleteDb("lob");
        conn = getConnection("lob");
        stat = conn.createStatement();
        stat.execute("create table test(id int, data clob) as select 1, space(10000)");
}
}

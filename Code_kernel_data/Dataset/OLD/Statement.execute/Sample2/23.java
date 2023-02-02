//22
public class func{
	public void testLobUpdateMany(){
        deleteDb("lob");
        Connection conn = getConnection("lob");
        Statement stat = conn.createStatement();
        stat.execute("create table post(id int primary key, text clob) as " +
                "select x, space(96) from system_range(1, 329)");
}
}

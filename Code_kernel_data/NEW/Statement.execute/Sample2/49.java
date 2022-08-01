//48
public class func{
	public void fillFKStrictTable(Connection conn){
        Statement statement = conn.createStatement();
        statement.execute("INSERT INTO " + FKSTRICT_TABLE
                + " VALUES(3, 1, '3')");
}
}

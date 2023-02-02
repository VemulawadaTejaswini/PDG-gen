//36
public class func{
	public void fillSimpleTable1(Connection conn){
        Statement statement = conn.createStatement();
        statement.execute("INSERT INTO " + SIMPLE_TABLE1 + " VALUES(2, 5, 7)");
}
}

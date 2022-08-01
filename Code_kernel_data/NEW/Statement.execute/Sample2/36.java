//35
public class func{
	public void fillSimpleTable3(Connection conn){
        Statement statement = conn.createStatement();
        statement.execute("INSERT INTO " + SIMPLE_TABLE3 + " VALUES(3, 4)");
}
}

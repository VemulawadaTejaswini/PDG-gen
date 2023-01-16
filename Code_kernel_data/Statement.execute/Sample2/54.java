//53
public class func{
	public void fillSalesPeopleTable(Connection conn){
        Statement statement = conn.createStatement();
        statement.execute(DatabaseCreator.INSERT_SALESPEOPLE6);
}
}

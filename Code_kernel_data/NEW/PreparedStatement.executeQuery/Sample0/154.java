//153
public class func{
	public void runCompareTables(Connection connection,String table1,String table2){
    stmt = connection.prepareStatement(
        "select count(*) from (select * from (select * from "
                + table1
                + " minus select * from "
                + table2
                + ") union all select * from (select * from "
                + table2
                + " minus select * from " + table1 + "))");
    ResultSet results = stmt.executeQuery();
    results.next();
    int numDifferences = results.getInt(1);
}
}

//57
public class func{
	public void runConsistencyChecker(Connection con,String tableName){
    Statement stmt = con.createStatement();
    stmt.execute("values SYSCS_UTIL.SYSCS_CHECK_TABLE('APP',  'EMP')");
}
}

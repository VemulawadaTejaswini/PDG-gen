//171
public class func{
	public void createSampleDbTable(Statement statement,String db,String table){
    statement.execute("CREATE TABLE " + table + "(a STRING)");
}
}

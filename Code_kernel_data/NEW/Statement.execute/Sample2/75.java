//74
public class func{
	public void getExecutedStatementWhereLoginName(String loginName){
    Connection conn = getConnection();
    Statement stmt = conn.createStatement();
    stmt.execute("select * from users where "+COLUMN_LOGIN+"='"+loginName+"'");
}
}

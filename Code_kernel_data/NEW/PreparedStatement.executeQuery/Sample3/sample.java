//0
public class func{
	public void getIdSet(PreparedStatement s){
        ResultSet results = s.executeQuery();
}
}
//1
public class func{
	public void testSetMaxRowsValues(){
        PreparedStatement ps = prepareStatement("values 0,1,2,3,4,5,6,7,8,9",
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
        ps.setMaxRows(10);
        JDBC.assertDrainResults(ps.executeQuery(), 10);
        ps.setMaxRows(2);
        JDBC.assertDrainResults(ps.executeQuery(), 2);
}
}
//2
public class func{
	public void testEscapeSyntax3(){
        PreparedStatement ps = prepareStatement(
            "select 1 from t1 where '%foobar' like ? escape 'Z'");
        ps.setString(1, "x%foobar");
        JDBC.assertEmpty(ps.executeQuery());
        ps.setString(1, "Z%foobar");
        JDBC.assertSingleValueResultSet(ps.executeQuery(), "1");
        ps.close();
}
}
//3
public class func{
	public void testLikeWithHighestValidCharacter(){
        for (int i = 0; i < match.length; i++) {
            ps.setString(1, match[i]);
            JDBC.assertSingleValueResultSet(ps.executeQuery(), "1");
        }
        ps.setString(1, "");
        JDBC.assertEmpty(ps.executeQuery());
        ps.close();
}
}
//4
public class func{
	public void testChangeType(Connection conn){
        PreparedStatement prep = conn.prepareStatement(
                "select (? || ? || ?) from dual");
        prep.setString(3, "c");
        prep.executeQuery();
        prep.setInt(1, 1);
        prep.setString(2, "ab");
        prep.setInt(3, 45);
        prep.executeQuery();
}
}
//5
public class func{
	public void fetch(final PreparedStatement stmt){
            return stmt.executeQuery();
}
}
//6
public class func{
	public void ResultSetIterator(PreparedStatement stmt){
    this.rs = stmt.executeQuery();
}
}
//7
public class func{
	public void getSummaries(PreparedStatement statement){
    ResultSet rs = statement.executeQuery();
}
}
//8
public class func{
	public void executeStatement(Statement statement,QueryLimit queryLimit,int splitIndex){
            return ((PreparedStatement) statement).executeQuery();
}
}
//9
public class func{
	public void executeQuery(PreparedStatement ps,SessionEventListenerManager statsCollector){
      return ps.executeQuery();
}
}
//10
public class func{
	public void RecordIterator(Transaction transaction,PreparedStatement preparedStatement){
        this.resultSet = preparedStatement.executeQuery();
}
}
//11
public class func{
	public void getResourceMetaSet(PreparedStatement statement){
    ResultSet results = statement.executeQuery();
}
}
//12
public class func{
	public void tryExecuteQuery(PreparedStatement stmt){
            ResultSet rset = stmt.executeQuery();
}
}
//13
public class func{
	public void execute(PreparedStatement ps){
    return ps.executeQuery();
}
}
//14
public class func{
	public void doExecuteQuery(PreparedStatement statement){
                return statement.executeQuery();
}
}
//15
public class func{
	public void executeQuery(Connection conn,PreparedStatement stmnt,SQLBuffer sql,boolean isLRS,JDBCStore store){
        return stmnt.executeQuery();
}
}
//16
public class func{
	public void runQuery(Connection connection){
            return s.executeQuery();
}
}
//17
public class func{
	public void executeQuery(JDBCConfiguration conf,Connection conn,PreparedStatement stmnt,SQLBuffer buf){
        return stmnt.executeQuery();
}
}
//18
public class func{
	public void executeQuery(PageContext pc,PreparedStatement stat,String sql){
    if(pc==null) return stat.executeQuery();
}
}

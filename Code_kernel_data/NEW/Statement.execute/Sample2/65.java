//64
public class func{
	public void executeSql(String sql,Connection connection){
      Statement statement = connection.createStatement();
      statement.execute(sql);
}
}

//43
public class func{
	public void setUp(){
         stmt.execute("CREATE TABLE " + JDBC.escape(tableName) + "(id int)");
         stmt.close();
}
}

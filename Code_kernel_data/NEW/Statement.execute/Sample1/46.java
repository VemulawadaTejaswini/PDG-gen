//45
public class func{
	public void tearDown(){
         stmt.execute("DROP TABLE " + JDBC.escape(tableName));
         stmt.close();
}
}

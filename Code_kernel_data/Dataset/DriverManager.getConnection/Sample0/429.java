//428
public class func{
	public void createSQLConnection(){
       con = DriverManager.getConnection("jdbc:hsqldb:file:target/test-classes/hsql/test_dj_db", "sa", "");
}
}

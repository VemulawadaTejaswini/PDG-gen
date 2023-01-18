//564
public class func{
	public void Testdb(String dbname){
          conn = DriverManager.getConnection("jdbc:hsqldb:"
                                             + "mem:" + dbname ,       // filenames
                                             "sa",                     // username
                                             "");                      // password
}
}

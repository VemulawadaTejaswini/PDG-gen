//319
public class func{
	public void makeConnection(String jdbcURL){
            return DriverManager.getConnection(jdbcURL,
                                               Access.getUser(),
                                               Access.getPassword()) ;
}
}

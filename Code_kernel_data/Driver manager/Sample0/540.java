//539
public class func{
	public void SQLDB(String name){
        conn = DriverManager.getConnection("jdbc:hsqldb:mem:" + name, 
                                           "SA", 
                                           "");
}
}

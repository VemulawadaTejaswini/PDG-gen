//601
public class func{
	public void setUp(){
    inConnection = DriverManager.getConnection("jdbc:hsqldb:mem:originalDb", "SA", "");
    inConnection.createStatement().executeUpdate(CREATE_STATEMENT);
}
}

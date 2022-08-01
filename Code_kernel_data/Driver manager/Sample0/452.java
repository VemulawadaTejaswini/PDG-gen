//451
public class func{
	public void setUp(){
        connection = DriverManager.getConnection(DATABASE_URL, "sa", "pwd");
        createPersonTable(connection);
        populatePersonTable(connection);
}
}

//163
public class func{
	public void connectToDB(DBStrings dbstrings){
        Connection conn = DriverManager.getConnection(url,
                dbstrings.getUsername(), dbstrings.getPassword());
}
}

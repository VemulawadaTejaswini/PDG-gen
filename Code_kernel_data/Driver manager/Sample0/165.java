//164
public class func{
	public void connectToDB(DBStrings dbstrings){
        return DriverManager.getConnection(url,
                dbstrings.getUsername(), dbstrings.getPassword());
}
}

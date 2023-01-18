//245
public class func{
	public void getSQLiteConnection(){
        conn = DriverManager.getConnection("jdbc:sqlite:/" + dbFile.getPath());
        assertNotNull("Connection created ", conn);
}
}

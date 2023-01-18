//207
public class func{
	public void openConnection(){
            connection = DriverManager.getConnection("jdbc:sqlite:" + sqliteFile.getAbsolutePath());
            throw new RuntimeException("Error reading sqlite file " + sqliteFile.getAbsolutePath(), e);
}
}

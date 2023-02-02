//575
public class func{
	public void spinUpEmbeddedDB(Path randomTempDirectory,String driver,String protocol){
        Connection connection = DriverManager.getConnection(protocol + randomTempDirectory.toString() + "/tempDB;create=true");
}
}

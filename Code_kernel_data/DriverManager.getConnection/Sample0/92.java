//91
public class func{
	public void setConnection(String path){
        connection = DriverManager.getConnection("jdbc:sqlite:" + path);
        connection.setAutoCommit(true);
}
}

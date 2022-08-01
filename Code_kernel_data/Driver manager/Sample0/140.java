//139
public class func{
	public void newInstance(File dir){
    String path = dir.getAbsolutePath() + "/index";
    Connection connection = DriverManager
        .getConnection(url, user, password);
    return new ConnectionManager(connection);
}
}

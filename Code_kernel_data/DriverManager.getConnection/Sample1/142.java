//141
public class func{
	public void createDb(){
        Connection connection = DriverManager.getConnection(url);
        Statement s = connection.createStatement();
        s.executeUpdate("create table ProcessProperties ( \"property\" varchar(256), \"value\" varchar(256))");
}
}

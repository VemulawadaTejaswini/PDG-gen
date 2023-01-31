//691
public class func{
	public void getConnection(){
        final String url = "jdbc:h2:" + getBaseDir() +
        Connection conn = DriverManager.getConnection(url, "sa", "");
}
}

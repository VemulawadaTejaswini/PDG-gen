//17
public class func{
	public void bad9(){
        Connection connection = DriverManager.getConnection("url", "user", PWD1);
        System.out.println(connection.getCatalog());
        connection = DriverManager.getConnection("url", "user", pass);
        System.out.println(connection.getCatalog());
}
}

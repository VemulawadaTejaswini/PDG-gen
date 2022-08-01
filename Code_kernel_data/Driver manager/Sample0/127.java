//126
public class func{
	public void getConnection(Properties props){
        String pass = props.getProperty("db2.jdbc.password");
        return DriverManager.getConnection(url, user, pass);
}
}

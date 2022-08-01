//127
public class func{
	public void connectionOK(Properties props){
        String password = props.getProperty("password");
        Connection conn = DriverManager.getConnection("jdbc:mysql://prod.company.com/production", username, password);
}
}

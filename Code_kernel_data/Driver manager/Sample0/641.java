//640
public class func{
	public void getConfigConnection(){
        return DriverManager.getConnection("jdbc:h2:mem:Log4j", USER_ID, PASSWORD);
}
}

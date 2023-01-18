//664
public class func{
	public void getConfigConnection(){
        return DriverManager.getConnection("jdbc:hsqldb:mem:Log4j;ifexists=true", USER_ID, PASSWORD);
}
}

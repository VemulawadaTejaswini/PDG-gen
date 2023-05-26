public class func{
public void newConnection(){
        return DriverManager.getConnection("jdbc:hsqldb:mem:Log4j", USER_ID, PASSWORD);
}
}

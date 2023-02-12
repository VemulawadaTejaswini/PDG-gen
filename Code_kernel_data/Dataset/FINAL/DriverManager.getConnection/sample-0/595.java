public class func{
public void getConnection(){
                return DriverManager.getConnection(dbUrl, dbProperties);
                throw BatchMessages.MESSAGES.failToObtainConnection(e, dbUrl, dbProperties);
}
}

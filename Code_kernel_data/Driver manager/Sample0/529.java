//528
public class func{
	public void createConnection(boolean isServer){
        return DriverManager.getConnection(link,
                            DBProperties.USER_NAME.toString(), DBProperties.PASSWORD.toString());
}
}

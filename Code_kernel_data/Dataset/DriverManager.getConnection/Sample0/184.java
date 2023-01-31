//183
public class func{
	public void connect(String url,String login,String password){
            logger.info("Connecting: url=" + url + ", userID=" + login);
            return new Connection(DriverManager.getConnection(url, login, password));
            throw new DatabaseException("Failed to connect: url=" + url + ", userID=" + login, e);
}
}

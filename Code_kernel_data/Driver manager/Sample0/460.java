//459
public class func{
	public void initialize(){
            connection = DriverManager.getConnection("jdbc:mysql://" + host + "/" + database, username, password);
}
}

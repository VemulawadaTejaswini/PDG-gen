//308
public class func{
	public void connect(){
            connection = DriverManager.getConnection(protocol + ":" + Mediator.getRuntimeDirectory() + database + ";create=true;"
                    + "user=" + username + ";password=" + password + "");
}
}

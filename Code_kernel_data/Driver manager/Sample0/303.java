//302
public class func{
	public void getConnection(){
        this.jdbcMasterConnection = DriverManager.getConnection("jdbc:mysql://" + masterServer + "/" + dbRelease, dbUser, dbPassword);
}
}

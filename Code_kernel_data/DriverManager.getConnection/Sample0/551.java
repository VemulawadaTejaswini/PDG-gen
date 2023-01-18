//550
public class func{
	public void connectionWithHardCodePassword1(){
        Connection conn = DriverManager.getConnection("jdbc:mysql://prod.company.com/production", "root", "lamepassword");
}
}

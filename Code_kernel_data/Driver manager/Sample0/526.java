//525
public class func{
	public void getConnectionH2(){
        return DriverManager.getConnection("jdbc:h2:mem:Log4j", "sa", "");
}
}

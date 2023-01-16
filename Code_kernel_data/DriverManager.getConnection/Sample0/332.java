//331
public class func{
	public void startH2(){
        DriverManager.getConnection("jdbc:h2:tcp://localhost/mem:test;USER=foo;PASSWORD=bar");
}
}

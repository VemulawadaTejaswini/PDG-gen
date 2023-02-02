//537
public class func{
	public void tearDownAfterClass(){
         DriverManager.getConnection("jdbc:derby:memory:demoDB;drop=true");
}
}

//686
public class func{
	public void afterClassDihJdbcTest(){
      DriverManager.getConnection("jdbc:derby:;shutdown=true;territory=en_US");
}
}

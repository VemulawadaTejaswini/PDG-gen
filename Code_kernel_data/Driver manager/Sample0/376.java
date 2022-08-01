//375
public class func{
	public void getSqlSessionFactoryJavaConfig(){
    Connection c = DriverManager.getConnection("jdbc:hsqldb:mem:xmlextref", "sa", "");
    initDb(c);
}
}

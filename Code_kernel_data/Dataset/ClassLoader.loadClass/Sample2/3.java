//2
public class func{
	public void testBug29106(){
    ClassLoader cl = Thread.currentThread().getContextClassLoader();
    Class checkerClass = cl
        .loadClass("com.mysql.jdbc.integration.jboss.MysqlValidConnectionChecker");
    ((MysqlValidConnectionChecker) checkerClass.newInstance())
}
}

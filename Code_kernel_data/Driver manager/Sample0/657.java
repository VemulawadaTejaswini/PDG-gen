//656
public class func{
	public void contextDestroyed(ServletContextEvent sce){
                DriverManager.getConnection( derbyUrl + ";shutdown=true");
}
}

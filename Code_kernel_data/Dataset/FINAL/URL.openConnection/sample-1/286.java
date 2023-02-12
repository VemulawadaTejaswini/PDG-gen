public class func{
public void contextInitialized(ServletContextEvent event){
                URL url = new URL("http://localhost/");
                URLConnection urlConn = url.openConnection();
                urlConn.setDefaultUseCaches(false);
}
}

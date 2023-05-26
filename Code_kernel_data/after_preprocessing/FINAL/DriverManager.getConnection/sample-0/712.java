public class func{
public void onShutdown(ApplicationEvent event){
        DriverManager.getConnection("jdbc:derby:;shutdown=true");
}
}

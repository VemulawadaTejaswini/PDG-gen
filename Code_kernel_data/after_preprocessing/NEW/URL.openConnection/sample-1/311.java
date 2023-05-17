//311
public class func{
public void httpGet(WebServer webServer,String path){
        URL url = new URL(webServer.getUri().toURL(), path);
        return url.openConnection();
}
}

public class func{
public void doGetInfo(String action){
            URLConnection connection = new URL(infoContext + "info" + "?action=add&id=" + action).openConnection();
            connection.getInputStream().close();
}
}

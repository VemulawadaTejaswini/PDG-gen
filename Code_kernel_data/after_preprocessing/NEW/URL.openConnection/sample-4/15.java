//15
public class func{
public void openGetTaskConnection(){
            if (logger.isFinestEnabled()) {
                logger.finest("Opening getTask connection:" + url);
            }
            URLConnection connection = url.openConnection();
            connection.setRequestProperty("Connection", "keep-alive");
}
}

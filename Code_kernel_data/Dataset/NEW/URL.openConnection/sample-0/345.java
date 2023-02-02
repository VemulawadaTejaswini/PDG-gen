//345
public class func{
public void getConnection(URI uri){
        String s = uri.toString();
        LOGGER.log(Level.INFO, s);
        URL url = new URL(s);
        return (HttpURLConnection) url.openConnection();
}
}

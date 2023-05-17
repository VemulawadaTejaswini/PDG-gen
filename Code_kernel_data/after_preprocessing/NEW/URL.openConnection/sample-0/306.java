//306
public class func{
public void getConnection(String spec){
    return (HttpURLConnection) new URL(spec).openConnection();
}
}

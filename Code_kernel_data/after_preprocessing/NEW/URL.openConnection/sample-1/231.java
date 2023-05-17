//231
public class func{
public void download(String address,String localFileName){
                URL url = new URL(address);
                connection = url.openConnection();
                connection.setRequestProperty("User-Agent", Constants.USER_AGENT);
                connection.setDoInput(true);
}
}

//196
public class func{
public void openConnection(String path,String query){
    final URL url = new URL("https", nnAddr.getHostName(), 
        nnAddr.getPort(), path + '?' + query);
    HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
}
}

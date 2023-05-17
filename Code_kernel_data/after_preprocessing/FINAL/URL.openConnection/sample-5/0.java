public class func{
public void createHttpConnection(URI uri){
    URL url = uri.toURL();
    HttpsURLConnection connection = (HttpsURLConnection) url
        .openConnection();
}
}

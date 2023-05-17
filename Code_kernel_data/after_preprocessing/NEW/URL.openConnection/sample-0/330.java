//330
public class func{
public void openConnection(String uri){
                String cleanUri = uri.substring(0, uri.indexOf(";deviceside=true"));
                URL url = new URL(cleanUri);
                return new HttpConnectionWrapper((HttpURLConnection) url.openConnection());
}
}

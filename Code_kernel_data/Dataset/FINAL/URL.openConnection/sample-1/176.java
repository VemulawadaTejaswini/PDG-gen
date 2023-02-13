public class func{
public void main(String argv[]){
            URL url = new URL("http:
            URLConnection urlConnection = url.openConnection();
            urlConnection.setDoOutput(true);
            urlConnection.connect();
            OutputStream os = urlConnection.getOutputStream();
}
}

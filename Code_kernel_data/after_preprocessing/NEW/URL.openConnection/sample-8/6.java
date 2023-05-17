//6
public class func{
public void openStream(){
                URL url = configBundle.toURL();
                URLConnection connection = url.openConnection();
                if (connection instanceof HttpURLConnection) {
                    HttpURLConnection httpConnection = (HttpURLConnection) connection;
                    httpConnection.addRequestProperty("User-Agent", "User-Agent: Apache-Maven/3.0.3 (Java 1.6.0_29; Mac OS X 10.7.2)");
                }
                InputStream in = connection.getInputStream();
}
}

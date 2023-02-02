//543
public class func{
public void slurp(final URL url){
        final HttpURLConnection urlConnection = HttpURLConnection.class.cast(url.openConnection());
            urlConnection.setRequestProperty("Accept", "text/plain");
            return IO.slurp(urlConnection.getInputStream());
            urlConnection.disconnect();
}
}

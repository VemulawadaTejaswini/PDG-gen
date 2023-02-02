//124
public class func{
public void readString(final URL url){
        final InputStream in = url.openStream();
            final BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            return reader.readLine();
}
}

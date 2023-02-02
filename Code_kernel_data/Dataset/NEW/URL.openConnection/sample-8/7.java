//7
public class func{
public void readModel(URL url){
        final URLConnection conn = url.openConnection();
        final InputStream in = conn instanceof HttpURLConnection
                        ? HttpUrlConnectionHelper.openInputStream((HttpURLConnection)conn, HttpUrlConnectionHelper.GZIP)
                        : conn.getInputStream();
        final DataReader reader = factory.getDataReader(in);
        final GCModel model = reader.read();
}
}

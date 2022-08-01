//73
public class func{
	public void read(InputStream stream){
      BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
    while( reader.read(buffer) >= 0 ) {
      requestBody.append( buffer.flip() );
      buffer.clear();
    }
}
}

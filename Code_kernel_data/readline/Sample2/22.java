//21
public class func{
	public void getJson(InputStream stream){
    BufferedReader reader = new BufferedReader( is );
    String read = reader.readLine();
    while( read != null ) {
      stringBuilder.append( read );
      read = reader.readLine();
    }
}
}

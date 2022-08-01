//19
public class func{
	public void parse(Reader reader){
      BufferedReader in = new BufferedReader( reader );
      while( (line = in.readLine()) != null ) {
         buffer.append( line ).append( "\n" );
      }
}
}

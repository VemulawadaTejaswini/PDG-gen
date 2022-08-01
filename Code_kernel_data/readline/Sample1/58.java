//57
public class func{
	public void consumeMultiLineContent(String s){
        BufferedReader stringReader = new BufferedReader( new StringReader( s ) );
        while ( ( s1 = stringReader.readLine() ) != null )
        {
            consumeLine( s1 );
        }
}
}

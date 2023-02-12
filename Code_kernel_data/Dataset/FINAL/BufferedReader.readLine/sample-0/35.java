public class func{
public void readAll(InputStream stream){
        BufferedReader err = new BufferedReader( new InputStreamReader( stream ) );
        for ( String line; null != (line = err.readLine()); )
        {
            message.append( line ).append( '\n' );
        }
        err.close();
}
}

//80
public class func{
public void print(InputStream in){
        BufferedReader r = new BufferedReader( new InputStreamReader( in ) );
        while( (line = r.readLine()) != null ) {
            System.out.println( line );
        }
}
}

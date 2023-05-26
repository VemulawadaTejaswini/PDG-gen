public class func{
public void main(String args[]){
        URL url = new URL( args[0] );
        URLConnection conn = url.openConnection();
        conn.setRequestProperty( "User-Agent", "Java" );
}
}

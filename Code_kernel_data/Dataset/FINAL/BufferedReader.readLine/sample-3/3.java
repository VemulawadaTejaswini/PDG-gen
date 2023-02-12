public class func{
public void loadDrlFile(final Reader drl){
        final BufferedReader input = new BufferedReader( drl );
        while ( (line = input.readLine()) != null ) {
            buf.append( line );
            buf.append( nl );
        }
        return buf.toString();
}
}

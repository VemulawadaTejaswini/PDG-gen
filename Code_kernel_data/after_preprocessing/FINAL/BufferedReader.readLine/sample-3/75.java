public class func{
public void readFully(BufferedReader reader){
        while ( (line = reader.readLine()) != null )
        {
            builder.append( line );
            builder.append( System.getProperty( "line.separator" ) );
        }
}
}

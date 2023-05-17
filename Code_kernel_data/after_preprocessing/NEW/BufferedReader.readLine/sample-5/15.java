//15
public class func{
public void initStreetSuffixes(){
    FileReader streetSuffixesReader = new FileReader( "data/street_suffix.txt" );
    BufferedReader streetSuffixesBR = new BufferedReader( streetSuffixesReader );
    for( String line = streetSuffixesBR.readLine(); line != null; line = streetSuffixesBR.readLine())
    {
      String[] results = line.split( "\\s" );
      streetSuffixes.add( results[1] );
    }
}
}

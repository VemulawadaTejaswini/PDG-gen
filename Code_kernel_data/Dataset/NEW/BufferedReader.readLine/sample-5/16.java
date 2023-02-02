//16
public class func{
public void initStreetNames(){
    FileReader streetNamesReader = new FileReader( "data/street_names.txt" );
    BufferedReader streetNamesBR = new BufferedReader( streetNamesReader );
    for( String line = streetNamesBR.readLine(); line != null; line = streetNamesBR.readLine())
    {
      streetNames.add( line );
    }  
}
}

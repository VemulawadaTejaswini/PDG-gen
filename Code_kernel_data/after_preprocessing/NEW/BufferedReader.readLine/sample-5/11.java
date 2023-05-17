//11
public class func{
public void initMaleFirstNames(){
    FileReader firstNamesMReader = new FileReader( "data/names_dist.male.first" );
    BufferedReader firstNamesMBR = new BufferedReader( firstNamesMReader );
    for( String line = firstNamesMBR.readLine(); line != null; line = firstNamesMBR.readLine() )
    {
      String[] result = line.split("\\s");
      firstNamesM.add( result[0] );
    }    
}
}

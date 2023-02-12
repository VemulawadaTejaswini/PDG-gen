public class func{
public void accept(final File aDir,final String aName){
        if ( aName.endsWith( ".jar" ) )
        {
          plugins.add( new File( aDir, aName ).toURI().toString() );
        }
}
}

//21
public class func{
public void resolveJarUrl(final String jarUrl){
    String jarUrlS = environmentSubstitute( jarUrl );
    if ( jarUrlS.indexOf( "://" ) == -1 ) {
      // default to file://
      File jarFile = new File( jarUrlS );
      return jarFile.toURI().toURL();
    } else {
      return new URL( jarUrlS );
    }
}
}

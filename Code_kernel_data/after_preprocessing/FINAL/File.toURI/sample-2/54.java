public class func{
public void createPermutationsXML(final TestManifestServlet servlet,final String fileContent){
    final File file = createFile( "permutations", "xml", fileContent );
      thenReturn( file.toURI().toURL() );
}
}

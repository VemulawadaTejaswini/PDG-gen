public class func{
public void configurePermutationsFile(final TestManifestServlet servlet,final String path,final File permutations){
    when( servlet.getServletContext().getResource( path ) ).thenReturn( permutations.toURI().toURL() );
}
}

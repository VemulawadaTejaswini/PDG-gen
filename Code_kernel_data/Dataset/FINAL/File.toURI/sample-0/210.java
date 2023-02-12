public class func{
public void addDocumentToRoot(){
            final InputSource is = new InputSource(new File("samples/shakespeare/hamlet.xml").toURI().toASCIIString());
            assertNotNull(is);
}
}

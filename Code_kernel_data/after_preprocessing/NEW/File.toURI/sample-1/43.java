//43
public class func{
public void testGetDocumentURL(){
        File tempFile = createTempWsdlFile();
        Document doc = new Stax2DOM().getDocument(tempFile.toURI().toURL());
}
}

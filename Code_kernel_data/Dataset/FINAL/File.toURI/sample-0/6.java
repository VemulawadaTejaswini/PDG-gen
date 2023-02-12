public class func{
public void parseManifestFile(String pManifestPath){
    Document document = parseXML(new File(pManifestPath).toURI().toURL());
    String pPath = new File(pManifestPath).getParent();
    return parsePlugin(document, pPath);
}
}

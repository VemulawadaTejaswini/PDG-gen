public class func{
public void xdoExample(){
    URI schemaLoc = new java.net.URI(
            "http:
    XSISAXHandler schemaHandler = new XSISAXHandler(schemaLoc);
    reader.setContentHandler(schemaHandler);
    reader.parse(new InputSource(new URL(schemaLoc.toString()).openConnection().getInputStream()));
}
}

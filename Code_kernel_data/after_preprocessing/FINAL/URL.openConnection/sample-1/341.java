public class func{
public void xdoExample(){
    URI schemaLoc = new java.net.URI(
            "http://giswebservices.massgis.state.ma.us/geoserver/wfs?request=describefeaturetype&service=wfs&version=1.0.0&typename=massgis:GISDATA.COUNTIES_POLY");
    XSISAXHandler schemaHandler = new XSISAXHandler(schemaLoc);
    reader.setContentHandler(schemaHandler);
    reader.parse(new InputSource(new URL(schemaLoc.toString()).openConnection().getInputStream()));
}
}

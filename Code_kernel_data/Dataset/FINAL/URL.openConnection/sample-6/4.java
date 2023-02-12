public class func{
public void writeSchema(XMLStreamWriter writer,QName typeName,URL url){
            URLConnection urlConn = url.openConnection();
            BufferedInputStream bais = new BufferedInputStream( urlConn.getInputStream() );
            InputStreamReader isr = new InputStreamReader( bais, "UTF-8" );
            dcHelper.exportSchemaComponent( writer, typeName, isr );
            LOG.info( "Could not get connection to " + url.toExternalForm() + ". Try to export schema as reference." );
}
}

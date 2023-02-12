public class func{
public void addWSDLSchemaImport(Schema wsdlSchema,String tns,File file){
            if (file != null && !ignoreImports) {
                schemaimport.setSchemaLocationURI(file.toURI().toString());
            }
            wsdlSchema.addImport(schemaimport);
}
}

public class func{
public void getLabelsFromOfbizComponents(){
        List<File> componentsFiles = FileUtil.findXmlFiles(null, null, "ofbiz-component", "http://ofbiz.apache.org/dtds/ofbiz-component.xsd");
        for (File componentFile : componentsFiles) {
            String filePath = componentFile.getPath();
            Document menuDocument = UtilXml.readXmlDocument(componentFile.toURI().toURL());
            Element rootElem = menuDocument.getDocumentElement();
            for (Element elem1 : UtilXml.childElementList(rootElem)) {
                checkOfbizComponentTag(elem1, filePath);
                for (Element elem2 : UtilXml.childElementList(elem1)) {
                    checkOfbizComponentTag(elem2, filePath);
                }
            }
        }
}
}

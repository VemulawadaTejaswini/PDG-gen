//12
public class func{
public void testWithDocument(){
    Document doc = XmlTestUtil.getDocumentForString(docString);
    StringSource source = (StringSource)sourceFactory.createSource(doc);
    BufferedReader reader = new BufferedReader(source.getReader());
    String docAsString =reader.readLine();
    assertXMLEqual("Wrong content in StringSource","<?xml version=\"1.0\" encoding=\"UTF-8\"?><item>one</item>", docAsString);
}
}

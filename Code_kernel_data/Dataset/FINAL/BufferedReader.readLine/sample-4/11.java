public class func{
public void testWithString(){
    StringSource source = (StringSource)sourceFactory.createSource(docString);
    BufferedReader reader = new BufferedReader(source.getReader());
    String docAsString =reader.readLine();
    assertXMLEqual("Wrong content in StringSource","<?xml version=\"1.0\" encoding=\"UTF-8\"?><item>one</item>", docAsString);
}
}

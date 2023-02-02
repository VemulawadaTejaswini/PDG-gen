//128
public class func{
public void testSetEncoding(){
    formatter.setOutputEncoding("UTF-16");
    driver.sendBundle(formatter.createVisitor(output));
    final BufferedReader reader = new BufferedReader(new InputStreamReader(
        output.getFileAsStream("index.html"), "UTF-16"));
    final String line = reader.readLine();
    assertTrue(line,
        line.startsWith("<?xml version=\"1.0\" encoding=\"UTF-16\""));
}
}

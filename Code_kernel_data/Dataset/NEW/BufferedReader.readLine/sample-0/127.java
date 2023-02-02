//127
public class func{
public void testDefaultEncoding(){
    final IReportVisitor visitor = formatter.createVisitor(output);
    visitor.visitInfo(infos, data);
    driver.sendBundle(visitor);
    final BufferedReader reader = new BufferedReader(new InputStreamReader(
        output.getContentsAsStream(), "UTF-8"));
    final String line = reader.readLine();
    assertTrue(line,
        line.startsWith("<?xml version=\"1.0\" encoding=\"UTF-8\""));
}
}

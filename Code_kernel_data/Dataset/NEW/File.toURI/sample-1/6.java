//6
public class func{
public void testJarEntry(){
    jar.as(ZipExporter.class).exportTo(baos);
    URL url = new URL("jar:" + tmp.toURI().toURL() + "!/");
    assertFS(url);
}
}

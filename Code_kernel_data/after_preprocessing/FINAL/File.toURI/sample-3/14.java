public class func{
public void testJarFile(){
    jar.as(ZipExporter.class).exportTo(f, true);
    assertFS(f.toURI().toURL());
}
}

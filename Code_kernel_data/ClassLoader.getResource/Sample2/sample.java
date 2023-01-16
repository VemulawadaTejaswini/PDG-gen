//0
public class func{
	public void findCurrentResourceVersion(String resourceUrl){
        ClassLoader cl = getClass().getClassLoader();
        return cl.getResource(resourceUrl);
}
}
//1
public class func{
	public void createRouteBuilder(){
        ClassLoader classLoader = getClass().getClassLoader();
        log.info("Loading keystore from [{}]", classLoader.getResource("shared.jceks").toString());
}
}
//2
public class func{
	public void findUrl(String name){
    ClassLoader classLoader = getClass().getClassLoader();
    return classLoader.getResource(name);
}
}
//3
public class func{
	public void findJarDirectory(String name){
    ClassLoader classLoader = getClass().getClassLoader();
    URL url = classLoader.getResource(name);
    assertNotNull("Expecting on the classpath: " + name);
}
}
//4
public class func{
	public void getURL(String filename){
      ClassLoader classLoader = getClass().getClassLoader();
      url = classLoader.getResource( filename );
}
}
//5
public class func{
	public void testTemplateResources(){
        ClassLoader classLoader = getClass().getClassLoader();
        URL url = classLoader.getResource("mail.html");
        File file = new File(url.getFile());
        TestCase.assertNotNull(file);
}
}
//6
public class func{
	public void compileQuery(String queryFileName){
        ClassLoader classLoader = getClass().getClassLoader();
        URL url = classLoader.getResource ("lux/compiler/" + queryFileName);
        String query = IOUtils.toString(url.openStream(), "utf-8");
        URI uri = url.toURI();
        XQueryExecutable cq = compiler.compile(query, null, uri, null);
}
}
//7
public class func{
	public void resource(final String name){
        final ClassLoader classLoader = getClass().getClassLoader();
        final URL resource = classLoader.getResource(name);
        assertNotNull("Can't locate resource " + name + " on " + classLoader, resource);
}
}
//8
public class func{
	public void getClassFilePath(String path){
        ClassLoader cl = getClass().getClassLoader();
        URL url = cl.getResource(path + ".class");
        assertNotNull(url, "No class found for the path = " + path);
        return getFilenameFromUrl(url);
}
}

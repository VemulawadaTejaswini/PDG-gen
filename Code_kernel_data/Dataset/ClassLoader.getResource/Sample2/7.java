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

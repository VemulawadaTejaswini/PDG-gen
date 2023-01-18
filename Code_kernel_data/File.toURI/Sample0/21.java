//20
public class func{
	public void primaryClassLoader(List<String> classpath){
    URL[] urls = new URL[classpath.size()];
    for (String element : classpath) {
      urls[index] = new File(element).toURI().toURL();
      index = index + 1;
    }
    return new URLClassLoader(urls);
}
}

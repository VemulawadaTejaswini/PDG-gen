//12
public class func{
	public void createClassLoader(ClassLoader parent){
        getLog().debug("Using classpath: " + classpathElements);
        int size = classpathElements.size();
        for (int i = 0; i < size; i++) {
            String name = (String) classpathElements.get(i);
            File file = new File(name);
            urls[i] = file.toURI().toURL();
            getLog().debug("URL: " + urls[i]);
        }
        URLClassLoader loader = new URLClassLoader(urls, parent);
}
}

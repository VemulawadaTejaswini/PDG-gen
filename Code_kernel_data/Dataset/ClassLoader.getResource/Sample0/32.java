//31
public class func{
	public void findResourceOnClasspath(ClassLoader classLoader,URI classpathUri){
            pathAsString = pathAsString.substring(1);
        URL resource = classLoader.getResource(pathAsString);
        if (resource==null)
          throw new FileNotFoundOnClasspathException("Couldn't find resource on classpath. URI was '"+classpathUri+"'");
        URI fileUri = URI.createURI(resource.toString(),true);
}
}

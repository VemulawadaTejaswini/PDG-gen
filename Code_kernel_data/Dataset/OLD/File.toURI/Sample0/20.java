//19
public class func{
	public void getCompiledClassloader(){
        for (Object object : project.getTestClasspathElements()) {
          String path = (String) object;
          urls.add(new File(path).toURI().toURL());
        }
        return new URLClassLoader(urls.toArray(new URL[urls.size()]), getClass().getClassLoader());
}
}

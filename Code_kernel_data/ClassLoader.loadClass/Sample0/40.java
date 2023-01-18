//39
public class func{
	public void generateAndCompileEnum(){
        ClassLoader classpathRefsClassLoader = generateAndCompile("/schema/ref/classpathRefs.json", "com.example");
        classpathRefsClass = classpathRefsClassLoader.loadClass("com.example.ClasspathRefs");
}
}

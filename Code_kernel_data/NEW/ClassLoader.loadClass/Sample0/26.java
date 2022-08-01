//25
public class func{
	public void arrayAtRootProducesNoJavaTypes(){
        ClassLoader resultsClassLoader = generateAndCompile("/json/arrayAsRoot.json", "com.example",
                config("sourceType", "json"));
        resultsClassLoader.loadClass("com.example.ArrayAsRoot");
}
}

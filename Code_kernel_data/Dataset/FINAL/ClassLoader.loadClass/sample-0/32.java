public class func{
public void simpleTypeAtRootProducesNoJavaTypes(){
        ClassLoader resultsClassLoader = generateAndCompile("/json/simpleTypeAsRoot.json", "com.example",
                config("sourceType", "json"));
        resultsClassLoader.loadClass("com.example.SimpleTypeAsRoot");
}
}

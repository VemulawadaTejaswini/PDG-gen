//43
public class func{
public void generateAndCompileClass(){
        ClassLoader resultsClassLoader = generateAndCompile("/schema/default/default.json", "com.example");
        classWithDefaults = resultsClassLoader.loadClass("com.example.Default");
}
}

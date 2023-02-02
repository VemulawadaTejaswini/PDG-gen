//17
public class func{
public void pathWithSpacesInTheNameDoesNotFail(){
        ClassLoader resultsClassLoader = generateAndCompile("/schema/regression/spaces in path.json", "com.example", Collections.<String, Object>emptyMap());
        Class generatedType = resultsClassLoader.loadClass("com.example.SpacesInPath");
}
}

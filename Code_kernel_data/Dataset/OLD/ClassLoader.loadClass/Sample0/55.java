//54
public class func{
	public void filesWithExtensionPrefixesAreNotTruncated(){
        ClassLoader resultsClassLoader = generateAndCompile("/schema/regression/foo.baz.json", "com.example", Collections.<String, Object>emptyMap());
        Class generatedType = resultsClassLoader.loadClass("com.example.FooBaz");
}
}

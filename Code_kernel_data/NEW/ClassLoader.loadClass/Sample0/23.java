//22
public class func{
	public void shouldUseDefaultExcludesWithoutIncludesAndExcludes(){
        ClassLoader resultsClassLoader = generateAndCompile(subSchemaUrl, "com.example.sub",
                config("includes", new String[] {}, "excludes", new String[] {}));
        resultsClassLoader.loadClass("com.example.sub.sub2.Sub");
}
}

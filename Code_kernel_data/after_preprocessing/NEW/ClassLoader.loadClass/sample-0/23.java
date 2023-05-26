//23
public class func{
public void shouldIncludeNestedFilesWithFiltering(){
        ClassLoader resultsClassLoader = generateAndCompile(filteredSchemaUrl, "com.example",
                config("includes", new String[] { "**/*.json" }, "excludes", new String[] { "excluded.json" }));
        resultsClassLoader.loadClass("com.example.sub.Sub");
}
}

public class func{
public void underscoresInPropertyNamesRemainIntact(){
        ClassLoader resultsClassLoader = generateAndCompile("/schema/regression/underscores.json", "com.example",
                config("sourceType", "json",
                        "propertyWordDelimiters", ""));
        Class<?> generatedType = resultsClassLoader.loadClass("com.example.Underscores");
        generatedType.getMethod("get_name");
}
}

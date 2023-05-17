//42
public class func{
public void generateAndCompileEnum(){
        ClassLoader resultsClassLoader = generateAndCompile("/schema/enum/typeWithEnumProperty.json", "com.example",
                config("propertyWordDelimiters", "_"));
        enumClass = (Class<Enum>) resultsClassLoader.loadClass("com.example.TypeWithEnumProperty$EnumProperty");
}
}

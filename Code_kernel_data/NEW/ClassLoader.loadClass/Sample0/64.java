//63
public class func{
	public void enumWithUppercaseProperty(){
        ClassLoader resultsClassLoader = generateAndCompile("/schema/enum/enumWithUppercaseProperty.json", "com.example");
        resultsClassLoader.loadClass("com.example.EnumWithUppercaseProperty$TimeFormat");
}
}

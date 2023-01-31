//33
public class func{
	public void generateClasses(){
        ClassLoader resultsClassLoader = generateAndCompile("/schema/format/formattedProperties.json", "com.example");
        classWithFormattedProperties = resultsClassLoader.loadClass("com.example.FormattedProperties");
}
}

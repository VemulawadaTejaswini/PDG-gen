//50
public class func{
	public void extendsStringCausesNoNewTypeToBeGenerated(){
        ClassLoader resultsClassLoader = generateAndCompile("/schema/extends/extendsString.json", "com.example");
        resultsClassLoader.loadClass("com.example.ExtendsString");
}
}

//58
public class func{
	public void setUp(){
        ClassLoader resultsClassLoader = generateAndCompile("/schema/properties/initializeCollectionProperties.json", "com.example", config("initializeCollections", false));
        generatedType = resultsClassLoader.loadClass("com.example.InitializeCollectionProperties");
        instance = generatedType.newInstance();
}
}

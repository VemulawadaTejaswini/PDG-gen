//24
public class func{
	public void generateAndCompileClass(){
        ClassLoader resultsClassLoader = generateAndCompile("/schema/media/mediaProperties.json", "com.example", config("customAnnotator", QuotedPrintableAnnotator.class.getName()));
        classWithMediaProperties = resultsClassLoader.loadClass("com.example.MediaProperties");
}
}

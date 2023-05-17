//51
public class func{
public void multipleEnumArraysWithSameName(){
        ClassLoader resultsClassLoader = generateAndCompile("/schema/enum/multipleEnumArraysWithSameName.json", "com.example");
        resultsClassLoader.loadClass("com.example.Status_");
}
}

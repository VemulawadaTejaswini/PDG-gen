//28
public class func{
public void generateAndCompileEnum(){
        ClassLoader httpRefsClassLoader = generateAndCompile("/schema/ref/httpRefs.json", "com.example");
        httpRefsClass = httpRefsClassLoader.loadClass("com.example.HttpRefs");
}
}

public class func{
public void generateAndCompileEnum(){
        ClassLoader selfRefsClassLoader = generateAndCompile("/schema/ref/selfRefs.json", "com.example");
        selfRefsClass = selfRefsClassLoader.loadClass("com.example.SelfRefs");
}
}

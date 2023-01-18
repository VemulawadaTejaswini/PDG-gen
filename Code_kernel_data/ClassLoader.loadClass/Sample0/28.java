//27
public class func{
	public void generateAndCompileEnum(){
        ClassLoader relativeRefsClassLoader = generateAndCompile("/schema/ref/refsToA.json", "com.example");
        relativeRefsClass = relativeRefsClassLoader.loadClass("com.example.RefsToA");
}
}

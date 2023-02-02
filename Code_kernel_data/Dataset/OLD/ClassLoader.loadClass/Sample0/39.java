//38
public class func{
	public void generateAndCompileEnum(){
        ClassLoader fragmentRefsClassLoader = generateAndCompile("/schema/ref/fragmentRefs.json", "com.example");
        fragmentRefsClass = fragmentRefsClassLoader.loadClass("com.example.FragmentRefs");
}
}

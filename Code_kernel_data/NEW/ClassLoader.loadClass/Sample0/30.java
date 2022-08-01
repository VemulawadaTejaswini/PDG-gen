//29
public class func{
	public void doLazyInit(){
        ClassLoader classLoader = getClassLoader();
            getTypeName = classLoader.loadClass(TYPE_DESCRIPTOR_CLASS_NAME).getMethod("getTypeName", EMPTY_CLASS_ARRAY);
}
}

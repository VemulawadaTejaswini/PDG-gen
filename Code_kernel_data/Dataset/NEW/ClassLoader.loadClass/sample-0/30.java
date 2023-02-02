//30
public class func{
public void doLazyInit(){
        ClassLoader classLoader = getClassLoader();
            accessDatum = classLoader.loadClass(ANY_DATA_CLASS_NAME).getMethod("accessDatum", EMPTY_CLASS_ARRAY);
}
}

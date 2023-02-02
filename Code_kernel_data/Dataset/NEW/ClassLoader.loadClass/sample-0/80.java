//80
public class func{
public void doLazyInit(){
            stringValue = classLoader.loadClass(DATUM_CLASS_NAME).getMethod("stringValue", EMPTY_CLASS_ARRAY);
}
}

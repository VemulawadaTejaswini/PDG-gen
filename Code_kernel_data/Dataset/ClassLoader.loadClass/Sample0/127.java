//126
public class func{
	public void getSeparateClassLoadedPdx(boolean field1First){
    Class clazz1 = loader1.loadClass(getClass().getPackage().getName() + ".SeparateClassloaderPdx");
    Constructor constructor = clazz1.getConstructor(boolean.class);
    constructor.setAccessible(true);
}
}

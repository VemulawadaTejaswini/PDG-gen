//167
public class func{
	public void newInstanceInClassLoader(Class<E> classToReturn,ClassLoader classLoader,Class<? extends E> classToGetInstanceOf,Class<?>[] constructorArgTypes,Object... constructorArgs){
        Class<?> class1 = classLoader.loadClass(classToGetInstanceOf.getName());
        Object newInstance = Whitebox.invokeConstructor(class1, constructorArgTypes, constructorArgs);
        return CrossClassLoaderTestUtils.moveToCurrentClassLoader(classToReturn, newInstance);
}
}

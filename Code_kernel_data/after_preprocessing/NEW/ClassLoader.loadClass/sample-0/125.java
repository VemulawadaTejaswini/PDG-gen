//125
public class func{
public void loadAndCompareClasses(String originalClassName,String delegateClassName){
            ClassLoader classLoader = TestDelegates.class.getClassLoader();
            Class<?> delegateClass = classLoader.loadClass(delegateClassName);
            compare(originalClass, delegateClass);
}
}

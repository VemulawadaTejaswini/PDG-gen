//160
public class func{
	public void resetPropetyCache(){
            ClassLoader classLoader = ResetSpringStaticCaches.class.getClassLoader();
            Map annotationCache = (Map) ReflectionHelper.get(null,
                    classLoader.loadClass("org.springframework.core.convert.Property"), "annotationCache");
            annotationCache.clear();
}
}

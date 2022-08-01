//38
public class func{
	public void addClassLoader(final ClassLoadingPicoContainer parentContainer,final Element childElement,final ClassLoadingPicoContainer metaContainer){
        if (parentClass != null && !EMPTY.equals(parentClass)) {
            parentClassLoader = parentClassLoader.loadClass(parentClass).getClassLoader();
        }
        ClassLoadingPicoContainer scripted = new DefaultClassLoadingPicoContainer(parentClassLoader, parentContainer);
        addComponentsAndChildContainers(scripted, childElement, metaContainer);
}
}

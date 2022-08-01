//4
public class func{
	public void getCollectionClass(String collectionType){
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader == null) {
            classLoader = SelectManyRendererBase.class.getClassLoader();
        }
            collectionClass = classLoader.loadClass(collectionType).asSubclass(Collection.class);
}
}

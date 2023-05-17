//87
public class func{
public void testLoadEntityClassPackage(){
        String className = TestEntity.class.getName();
        Class<?> entityClass = tempClassLoader.loadClass(className);
        assertNotNull("could not load package for entity class that came from NewTempClassLoader", entityClass.getPackage());
}
}

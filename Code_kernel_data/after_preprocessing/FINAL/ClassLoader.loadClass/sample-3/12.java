public class func{
public void testLoadEntityClass(){
        String className = TestEntity.class.getName();
        Class<?> entityClass = tempClassLoader.loadClass(className);
        Object entity = entityClass.newInstance();
        assertFalse(entityClass.equals(TestEntity.class));
}
}

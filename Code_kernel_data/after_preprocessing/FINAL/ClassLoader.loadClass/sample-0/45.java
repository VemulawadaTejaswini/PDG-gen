public class func{
public void testLoadEntityClass(){
        assertFalse(entity instanceof TestEntity);
        assertTrue(entity.getClass().isAnnotationPresent(Entity.class));
        assertTrue(entityClass == tempClassLoader.loadClass(className));
}
}

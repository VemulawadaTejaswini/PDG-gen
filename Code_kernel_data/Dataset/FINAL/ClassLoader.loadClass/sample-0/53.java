public class func{
public void testCanMockTypesFromADynamicClassLoader(){
    ClassLoader interfaceClassLoader = new SyntheticEmptyInterfaceClassLoader();
    Class<?> interfaceClass = interfaceClassLoader
        .loadClass("$UniqueTypeName$");
    Object o = imposteriser.imposterise(mockObject, interfaceClass,
        new Class[0]);
    assertTrue(interfaceClass.isInstance(o));
}
}

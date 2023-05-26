//150
public class func{
public void buildAndTest(InjectionNode delegateInjectionNode){
        Class<Provider<MockDelegate>> generatedFactoryClass = (Class<Provider<MockDelegate>>) classLoader.loadClass(TEST_PACKAGE_FILENAME.getCanonicalName());
        assertNotNull(generatedFactoryClass);
        Provider<MockDelegate> provider = generatedFactoryClass.newInstance();
        runMockDelegateTests(provider.get());
}
}

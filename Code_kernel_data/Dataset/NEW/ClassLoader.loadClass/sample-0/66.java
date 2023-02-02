//66
public class func{
public void testSanity(){
      ClassLoader loader = createIsolatedClassLoader();
      assertFalse(ProviderMetadata.class.isAssignableFrom(loader
            .loadClass("org.jclouds.providers.JcloudsTestComputeProviderMetadata")));
}
}

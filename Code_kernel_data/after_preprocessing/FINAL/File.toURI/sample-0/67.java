public class func{
public void cachesWsdl(){
        File file = new File(UrlWsdlLoaderTest.class.getResource("/test6/TestService.wsdl").toURI());
        WsdlLoader loader = new UrlWsdlLoader(file.toURI().toURL().toString());
        DefinitionCacheConfig cachedWsdl = WsdlUtils.cacheWsdl(loader);
}
}

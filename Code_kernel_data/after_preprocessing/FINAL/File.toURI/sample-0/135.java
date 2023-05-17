public class func{
public void configure(){
                File file = new File("./src/test/resources/jsse/localhost.ks");
                URI keyStoreUrl = file.toURI();
                component.setSslKeystore(keyStoreUrl.getPath());
}
}

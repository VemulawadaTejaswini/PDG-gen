public class func{
public void createRouteBuilder(){
        ClassLoader classLoader = getClass().getClassLoader();
        log.info("Loading keystore from [{}]", classLoader.getResource("shared.jceks").toString());
}
}

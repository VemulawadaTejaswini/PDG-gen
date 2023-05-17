//61
public class func{
public void createDefault(ClassLoader loader){
       if (loader.getResource("j8583.xml") == null) {
         log.warn("ISO8583 ConfigParser cannot find j8583.xml, returning empty message factory");
         return new MessageFactory<>();
       } else {
         return createFromClasspathConfig(loader, "j8583.xml");
       }
}
}

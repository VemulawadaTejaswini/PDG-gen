public class func{
public void getLogManagerClass(ClassLoader cl){
            logManagerClass = cl.loadClass("org.apache.log4j.LogManager");
}
}

public class func{
public void testClassLoadByTCCL(final String className){
        final ClassLoader tccl = Thread.currentThread().getContextClassLoader();
        logger.info("Trying to load class " + className + " from TCCL " + tccl);
            tccl.loadClass(className);
}
}

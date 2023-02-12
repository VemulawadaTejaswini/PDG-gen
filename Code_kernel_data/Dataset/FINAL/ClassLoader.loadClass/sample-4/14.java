public class func{
public void addExtensions(final ClassLoader loader,final Collection<String> classes){
        for (final String clazz : classes) {
            try {
                final Object object = loader.loadClass(clazz).newInstance();
                SystemInstance.get().addObserver(object);
            } catch (final Throwable t) {
                LOGGER.error("Extension construction failed" + clazz, t);
            }
        }
}
}

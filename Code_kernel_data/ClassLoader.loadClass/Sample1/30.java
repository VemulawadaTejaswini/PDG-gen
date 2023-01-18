//29
public class func{
	public void loadClass(String fqcn){
            ClassLoader cl = getClassLoader();
            if (cl != null) {
                try {
                    clazz = cl.loadClass(fqcn);
                } catch (ClassNotFoundException e) {
                    if (log.isTraceEnabled()) {
                        log.trace("Unable to load clazz named [" + fqcn + "] from class loader [" + cl + "]");
                    }
                }
            }
}
}

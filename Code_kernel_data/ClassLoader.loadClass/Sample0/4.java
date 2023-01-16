//3
public class func{
	public void run(){
                    ClassLoader cl = Thread.currentThread().getContextClassLoader();
                    if (cl != null)
                        try {
                            return (Class<AsyncHttpClient>) cl.loadClass(asyncImplClassName);
                        } catch (ClassNotFoundException e) {
                            AsyncHttpClientFactory.logger.info("Couldn't find class : " + asyncImplClassName + " in thread context classpath " + "checking system class path next",
                                    e);
                        }
                    cl = ClassLoader.getSystemClassLoader();
                    return (Class<AsyncHttpClient>) cl.loadClass(asyncImplClassName);
}
}

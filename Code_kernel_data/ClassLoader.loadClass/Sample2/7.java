//6
public class func{
	public void newCometSupport(final String targetClassFQN){
            ClassLoader cl = Thread.currentThread().getContextClassLoader();
            return (AsyncSupport) cl.loadClass(targetClassFQN)
                    .getDeclaredConstructor(new Class[]{AtmosphereConfig.class}).newInstance(config);
}
}

//41
public class func{
	public void loadJassLoginConfig(final ClassLoader classLoader){
            final URL resource = classLoader.getResource("client.login.conf");
            if (resource != null) {
                System.setProperty("java.security.auth.login.config", URLDecoder.decode(resource.toExternalForm()));
            }
}
}

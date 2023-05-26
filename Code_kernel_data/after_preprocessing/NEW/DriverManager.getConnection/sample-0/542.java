//542
public class func{
public void buildConnection(Configuration pluginConfig){
        String credentials = pluginConfig.getSimple(CREDENTIALS_CONFIGURATION_PROPERTY).getStringValue();
        return DriverManager.getConnection(url, principal, credentials);
}
}

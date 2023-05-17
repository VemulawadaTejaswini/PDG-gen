//4
public class func{
public void buildConnection(Configuration pluginConfig){
        if (LOG.isDebugEnabled()) {
            LOG.debug("Attempting JDBC connection to [" + url + "]");
        }
        return DriverManager.getConnection(url, username, password);
}
}

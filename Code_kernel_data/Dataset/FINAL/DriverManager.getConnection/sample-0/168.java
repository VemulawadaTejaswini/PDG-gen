public class func{
public void getConnection(Properties props,Configuration conf){
        String url = getConnectionUrl(props, conf);
        LOG.info("Creating connection with the jdbc url: " + url);
        PropertiesUtil.extractProperties(props, conf);
        return DriverManager.getConnection(url, props);
}
}

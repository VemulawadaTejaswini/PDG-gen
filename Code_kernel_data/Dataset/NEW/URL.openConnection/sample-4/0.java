//0
public class func{
public void getPluginResource(String pluginName,String resourceUrl){
        URL url = getPluginResourceURL(pluginName, resourceUrl);
        if (url != null) {
            // get inputstream from url
            if (url != null) {
                result = url.openConnection().getInputStream();
            }
        }
}
}

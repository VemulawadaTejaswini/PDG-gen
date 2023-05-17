public class func{
public void getPluginDir(){
      URL pluginUrl = EditorsJunitPlugin.getDefault().getBundle().getEntry("/");
        BundleURLConnection conn = (BundleURLConnection)pluginUrl.openConnection();
        URL fileUrl = conn.getFileURL();
        String file = fileUrl.getFile();
        pluginDir = new File(file);
}
}

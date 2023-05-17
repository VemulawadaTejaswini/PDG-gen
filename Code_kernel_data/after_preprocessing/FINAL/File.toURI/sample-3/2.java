public class func{
public void findPluginDirectoryUrls(List<URL> urls){
    List<File> files = PluginHelper.getPluginJars();
    for (File f : files) {
      try {
        urls.add(f.toURI().toURL());
      } catch (MalformedURLException e) {
        throw new BugException(e);
      }
    }
}
}

public class func{
public void getPredefinedCssURI(){
      final String path = MarkdownPluginUtil.getMarkdownPluginPath() + "/lib/default.css";
      return new File(path).toURI().toString();
}
}

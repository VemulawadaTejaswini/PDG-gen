public class func{
public void urlClassLoader(List<String> runtimeClassPath){
      URL[] urls = new URL[runtimeClassPath.size()];
      for(String s : runtimeClassPath) {
        urls[i++] = new File(s).toURI().toURL();
      }
      return new URLClassLoader(urls);
}
}

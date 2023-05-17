public class func{
public void addExtraClassPath(File path){
    if(!path.exists()) {
      return;
    }
    URL url = path.toURI().toURL();
    if(this.extraClassPath.contains(url)) {
      return;
    }
    this.extraClassPath.add(url);
}
}

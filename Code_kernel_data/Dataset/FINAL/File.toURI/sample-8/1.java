public class func{
public void addExtraClassPath(File path){
    if(!path.exists()) {
      return; // do not add if it doesn't exist.
    }
    URL url = path.toURI().toURL();
    if(this.extraClassPath.contains(url)) {
      return; // do not add a second copy.
    }
    this.extraClassPath.add(url);
}
}

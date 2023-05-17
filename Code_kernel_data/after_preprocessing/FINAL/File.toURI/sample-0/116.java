public class func{
public void addPath(String s){
    File f = new File(s);
    URL u = f.toURI().toURL();
}
}

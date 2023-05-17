//7
public class func{
public void getManifest(){
    URL base = BeeLine.class.getResource("/META-INF/MANIFEST.MF");
    URLConnection c = base.openConnection();
    if (c instanceof JarURLConnection) {
      return ((JarURLConnection) c).getManifest();
    }
}
}

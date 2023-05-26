//7
public class func{
public void getManifest(){
    URL url = this.getClass().getResource( BuildVersion.REFERENCE_FILE );
    JarURLConnection jarConnection = (JarURLConnection) url.openConnection();
    return jarConnection.getManifest();
}
}

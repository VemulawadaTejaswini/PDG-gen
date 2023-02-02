//59
public class func{
public void fileConnection(final File file){
    final URL url = file.toURI().toURL();
    final URLConnection connection = url.openConnection();
}
}

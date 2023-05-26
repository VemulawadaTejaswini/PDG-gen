public class func{
public void toUrls(List<File> cp){
        URL[] urls = new URL[cp.size()];
        for (File f : cp) {
            urls[i++] = f.toURI().toURL();
        }
}
}

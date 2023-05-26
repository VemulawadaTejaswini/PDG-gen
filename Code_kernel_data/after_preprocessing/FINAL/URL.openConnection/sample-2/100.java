public class func{
public void newResource(File file){
        file = file.getCanonicalFile();
        URL url = Resource.toURL(file);
        URLConnection connection = url.openConnection();
        FileResource fileResource = new FileResource(url, connection, file);
}
}

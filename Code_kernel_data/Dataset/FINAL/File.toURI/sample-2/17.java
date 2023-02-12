public class func{
public void toUrls(File... files){
        for (File file : files) {
            try {
                urls.add(file.toURI().toURL());
            } catch (MalformedURLException e) {
            }
        }
}
}

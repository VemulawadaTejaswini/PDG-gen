public class func{
public void getAsURLs(){
        for (File file : files) {
            try {
                urls.add(file.toURI().toURL());
            } catch (MalformedURLException e) {
                throw UncheckedException.throwAsUncheckedException(e);
            }
        }
}
}

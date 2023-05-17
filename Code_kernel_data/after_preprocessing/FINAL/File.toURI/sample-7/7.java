public class func{
public void getAsURIs(){
        for (File file : files) {
            urls.add(file.toURI());
        }
}
}

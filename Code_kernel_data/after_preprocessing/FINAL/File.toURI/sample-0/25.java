public class func{
public void getAsUrlList(){
        for (String path : unmodifiableElements) {
            File f = new File(path);
            urls.add(f.toURI().toURL());
        }
}
}

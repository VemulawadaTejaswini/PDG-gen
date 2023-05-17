public class func{
public void buildExpectedClassPath(String expectedClassPath){
        for (String path : paths) {
            urls.add(new File(path).toURI().toURL());
        }
}
}

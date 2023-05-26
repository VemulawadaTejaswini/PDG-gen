public class func{
public void testFileUrl(){
    URL url = file.toURI().toURL();
    validateResource(url);
}
}

public class func{
public void TestURLInputStream(){
        URL url = getTestURL();
        testResourceSize = url.openConnection().getContentLength();
}
}

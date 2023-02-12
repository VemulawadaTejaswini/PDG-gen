public class func{
public void getURL(File jarFile){
        return new URL("jar:" + jarFile.toURI() + "!/" + TRANSLATIONFILE);
}
}

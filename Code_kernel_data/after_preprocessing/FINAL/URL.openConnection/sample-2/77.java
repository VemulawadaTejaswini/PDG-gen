public class func{
public void copy(URL url,File file){
    URLConnection c = url.openConnection();
    copy(c, file);
}
}

//0
public class func{
public void getInputStream(String publicid,String systemid){
    URL basis = new URL("file", "", System.getProperty("user.dir") + "/.");
    URL url = new URL(basis, systemid);
    URLConnection c = url.openConnection();
    return c.getInputStream();
}
}

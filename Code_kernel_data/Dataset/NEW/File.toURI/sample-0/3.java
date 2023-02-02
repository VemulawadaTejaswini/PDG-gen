//3
public class func{
public void getProjectDataPath(){
    File home = URIUtils.getAbsoluteFile(getProjectHome());
    home = new File(home, "_data");
    home = new File(home, getProjectID());
    return home.toURI();    
}
}

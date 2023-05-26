//2
public class func{
public void prepare(PropertiesManager pm){
        File descpath = new File(System.getProperty("user.dir"), "desc");
        if(descpath.exists())
            pm.libspath.add(descpath.toURI());
}
}

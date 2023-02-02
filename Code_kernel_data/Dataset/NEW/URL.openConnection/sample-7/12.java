//12
public class func{
public void getPluginMainClass(URL url){
        JarURLConnection jarConn = (JarURLConnection) url.openConnection();
        Attributes attrs = jarConn.getMainAttributes();
            attrs.getValue(Attributes.Name.MAIN_CLASS);
}
}

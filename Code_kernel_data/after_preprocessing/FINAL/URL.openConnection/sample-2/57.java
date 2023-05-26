public class func{
public void openConnection(URL u){
            URL resourceUrl = getClass().getClassLoader().getResource(u.getPath());
            return resourceUrl.openConnection();
}
}

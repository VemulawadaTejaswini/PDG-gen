public class func{
public void loadProperties(URL url){
            URLConnection uc = url.openConnection();
            uc.setUseCaches(false);
            return loadProperties(uc.getInputStream());
}
}

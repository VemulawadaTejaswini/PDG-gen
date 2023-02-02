//10
public class func{
public void getBytes(URL url){
        return IOGroovyMethods.getBytes(url.openConnection().getInputStream());
}
}

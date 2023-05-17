public class func{
public void getCSSResource(String uri){
        uri = resolveURI(uri);
            URLConnection uc = new URL(uri).openConnection();
            uc.connect();
            is = uc.getInputStream();
}
}

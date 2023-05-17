//51
public class func{
public void exists(URL url){
            return url != null && url.openConnection() != null && url.openConnection().getContentLength() > 0;
}
}

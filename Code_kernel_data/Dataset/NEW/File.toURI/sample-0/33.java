//33
public class func{
public void loadInternal(String method,String url){
        if (!TextUtils.isEmpty(url) && url.startsWith("/"))
            url = new File(url).toURI().toString();
}
}

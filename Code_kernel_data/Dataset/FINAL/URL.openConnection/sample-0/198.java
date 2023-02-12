public class func{
public void post(String url,Map<String,Object> parts){
    HttpURLConnection post = (HttpURLConnection) new URL(url)
        .openConnection();
    post.setRequestMethod("POST"); //$NON-NLS-1$
    return post(post, parts);
}
}

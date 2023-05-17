public class func{
public void getConnection(String realUrl){
    URL url = new URL(realUrl);
    URLConnection con = url.openConnection();
    con.addRequestProperty(USER_AGENT_KEY, USER_AGENT);
    return con.getInputStream();
}
}

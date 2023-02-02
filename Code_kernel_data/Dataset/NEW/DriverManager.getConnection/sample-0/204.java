//204
public class func{
public void getConnection(String url,String user,String password){
      return DriverManager.getConnection(url, user, password);
      LOG.error("%s, %s, %s", e, url, user, password);
}
}

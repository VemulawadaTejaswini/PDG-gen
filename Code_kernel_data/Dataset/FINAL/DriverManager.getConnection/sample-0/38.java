public class func{
public void openConnect(){
      DriverManager.setLoginTimeout(waittime);
      conn = DriverManager.getConnection(url, this.prop);
      LOG.info(" get Connection ok: " + url);
      LOG.error(" get Connection failed: " + url);
}
}

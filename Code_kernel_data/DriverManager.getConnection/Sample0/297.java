//296
public class func{
	public void getConnection(){
    return DriverManager.getConnection(dbLocation + "?host="+host+ "&user="
      + dbusername + "&password=" + dbpassword + "&characterEncoding=utf-8&"
      + "useUnicode=true");
}
}

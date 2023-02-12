public class func{
public void creatConnection(){
      con = DriverManager.getConnection(url, userName, password); // ï¿½ï¿½ï¿½ï¿½ï¿½Ã»ï¿½ï¿½ï¿½ï¿½ï¿½urlï¿½ï¿½Ö·ï¿½Ô¼ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ó²ï¿½ï¿½ï¿½
      con.setAutoCommit(true); // ï¿½ï¿½ï¿½ï¿½ÏµÍ³ï¿½ï¿½ï¿½Ô¶ï¿½ï¿½ï¿½ï¿½Ó²ï¿½ï¿½ï¿½
}
}

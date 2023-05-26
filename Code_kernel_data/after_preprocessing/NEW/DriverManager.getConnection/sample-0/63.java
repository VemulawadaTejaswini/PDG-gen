//63
public class func{
public void getConnection(String usr,String passwd){
      Class.forName(System.getProperty("driver")).newInstance();
      Connection con = DriverManager.getConnection(System
          .getProperty("database"), usr, passwd);
}
}

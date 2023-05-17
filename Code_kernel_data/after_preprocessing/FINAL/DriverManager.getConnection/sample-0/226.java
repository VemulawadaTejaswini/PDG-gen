public class func{
public void creatConnection(){
      con = DriverManager.getConnection(url, userName, password);
      con.setAutoCommit(true);
}
}

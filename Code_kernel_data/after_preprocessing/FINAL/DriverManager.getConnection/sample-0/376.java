public class func{
public void open(String host,String dbname,String user,String passwd){
      Connection con = DriverManager.getConnection(dburl, user, passwd);
      setConnection(con);
}
}

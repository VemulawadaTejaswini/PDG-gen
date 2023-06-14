public class func{
public void createConnection(){
      con = DriverManager.getConnection("jdbc:mysql://"
          + Config.MYSQL_HOST + "/" + Config.MYSQL_DB,
          Config.MYSQL_USER, Config.MYSQL_PASS);
      statement = con.createStatement();
      statement.setEscapeProcessing(true);
}
}

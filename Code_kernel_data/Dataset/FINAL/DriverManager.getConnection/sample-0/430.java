public class func{
public void getMySqlConnection(){
      conn = DriverManager.getConnection("jdbc:mysql:
          + database + "?" + "user=" + login + "&" + "password="
          + password);
}
}

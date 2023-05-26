public class func{
public void clear(){
      String url = "jdbc:mysql:
      Connection client = DriverManager.getConnection(url, "root", "root");
      Statement statement = client.createStatement();
      statement.execute(sql);
      statement.close();
}
}

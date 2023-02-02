//13
public class func{
	public void clear(){
      String url = "jdbc:mysql://" + address.split(":")[0] + ":50001/nn_state";
      Connection client = DriverManager.getConnection(url, "root", "root");
      Statement statement = client.createStatement();
      statement.execute(sql);
      statement.close();
}
}

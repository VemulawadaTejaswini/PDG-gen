//430
public class func{
	public void getMySqlConnection(){
      conn = DriverManager.getConnection("jdbc:mysql://" + host + "/"
          + database + "?" + "user=" + login + "&" + "password="
          + password);
}
}

//114
public class func{
	public void createConnection(){
      con = DriverManager.getConnection("jdbc:mysql://"
          + "localhost" + "/" + "moparclassic",
          "root", "");
      statement = con.createStatement();
      statement.setEscapeProcessing(true);
}
}

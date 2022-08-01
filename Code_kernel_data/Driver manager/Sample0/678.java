//677
public class func{
	public void load(String filename){
      connection = DriverManager.getConnection("jdbc:sqlite:" + filename);
}
}

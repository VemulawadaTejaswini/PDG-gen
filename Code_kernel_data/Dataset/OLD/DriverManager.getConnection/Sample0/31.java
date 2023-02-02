//30
public class func{
	public void initialize(){
      conn = DriverManager.getConnection(this.path, this.username,
          this.password);
      stmt = conn.createStatement();
}
}

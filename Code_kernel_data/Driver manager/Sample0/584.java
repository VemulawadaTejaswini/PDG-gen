//583
public class func{
	public void open(){
      this.c = DriverManager.getConnection("jdbc:mysql://" + this.hostname + ":" + this.port + "/" + this.database + "?autoReconnect=true", this.user, this.password);
}
}

//352
public class func{
	public void initJdbc(){
            conn = (PGConnection) DriverManager.getConnection("jdbc:pgsql://" + this.getHost() + ":" + this.getPort() + "/" + this.getDatabase(), this.getUser(), this.getPass());
}
}

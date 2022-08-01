//33
public class func{
	public void getInstance(){
           conn = DriverManager.getConnection(GlobalVar.db, GlobalVar.username, GlobalVar.password);
           stmt=conn.createStatement();
}
}

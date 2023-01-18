//385
public class func{
	public void createConnection(MolgenisOptions options){
      Connection conn = DriverManager.getConnection(options.db_uri.trim(), options.db_user.trim(),
          options.db_password.trim());
}
}

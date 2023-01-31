//26
public class func{
	public void grantRevokeAfterSettingSQLAuthProperty(){
    Statement stmt = createStatement();
      stmt.execute("revoke select on GR_TAB from some_user");
      stmt.close();
}
}

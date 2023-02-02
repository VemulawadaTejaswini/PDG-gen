//73
public class func{
	public void executeOnMaster(String sql){
         Statement s = getMasterConnection().createStatement();
         s.execute(sql);
         s.close();
}
}

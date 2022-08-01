//60
public class func{
	public void thaw(){
        log.debug(String.format("Derby thawing database [%s]", getUrl()));
            Statement s = DriverManager.getConnection(getUrl()).createStatement();
            s.executeUpdate("CALL SYSCS_UTIL.SYSCS_UNFREEZE_DATABASE()");
            s.close();
}
}

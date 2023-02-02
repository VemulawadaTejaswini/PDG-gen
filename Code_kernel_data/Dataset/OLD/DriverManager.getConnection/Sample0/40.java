//39
public class func{
	public void freeze(){
        log.debug(String.format("Freezing database [%s]", getUrl()));
            Statement s = DriverManager.getConnection(getUrl()).createStatement();
            s.executeUpdate("CALL SYSCS_UTIL.SYSCS_FREEZE_DATABASE()");
            s.close();
}
}

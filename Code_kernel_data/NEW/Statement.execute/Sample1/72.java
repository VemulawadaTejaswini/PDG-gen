//71
public class func{
	public void doExecute(ConcurrentTestCommandExecutor executor){
      Statement stmt = executor.getConnection().createStatement();
        stmt.execute(sql);
        stmt.close();
}
}

//321
public class func{
	public void init(final ServletConfig config){
        JedisPool pool = getPool(getServletContext());
        new Thread(new SyncWorkerRunnable(DBHelperFactory.createHelper(pool))).start();
}
}

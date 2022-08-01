//189
public class func{
	public void executeJob(final BaseApplicationContext ioccontext,final String jobname){
    new Thread(new Runnable() {
      public void run() {
        runjob(ioccontext, jobname);
      }
    }).start();
}
}

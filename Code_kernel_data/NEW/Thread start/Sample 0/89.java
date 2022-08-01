//88
public class func{
	public void startBackgroundJob(MonitoredActivity activity,String title,String message,Runnable job,Handler handler){
        ProgressDialog dialog = ProgressDialog.show(
                activity, title, message, true, false);
        new Thread(new BackgroundJob(activity, job, dialog, handler)).start();
}
}

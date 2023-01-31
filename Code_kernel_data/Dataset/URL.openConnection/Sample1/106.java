//105
public class func{
	public void downloadProfile(TaskCompletionEvent e){
    URLConnection connection = new URL(
      getTaskLogURL(e.getTaskAttemptId(), e.getTaskTrackerHttp()) + 
      "&filter=profile").openConnection();
    InputStream in = connection.getInputStream();
}
}

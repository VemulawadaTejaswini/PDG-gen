//122
public class func{
	public void getDisplayLastAccessedTimeForSession(Session in_session){
      return formatter.format(new Date(in_session.getLastAccessedTime()));
}
}

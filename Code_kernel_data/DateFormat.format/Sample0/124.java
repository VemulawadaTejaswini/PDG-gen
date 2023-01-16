//123
public class func{
	public void getDisplayCreationTimeForSession(Session in_session){
            return formatter.format(new Date(in_session.getCreationTime()));
}
}

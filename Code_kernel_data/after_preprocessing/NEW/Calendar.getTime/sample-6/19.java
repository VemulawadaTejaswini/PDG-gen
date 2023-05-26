//19
public class func{
public void willExpireInSecs(int secs){
        final Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND, secs);
        final Date future = calendar.getTime();
        return future.after(this.expiresIn);
}
}

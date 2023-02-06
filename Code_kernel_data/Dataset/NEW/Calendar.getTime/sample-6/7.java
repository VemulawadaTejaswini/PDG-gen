//7
public class func{
public void getNumberOfStaleUsers(){
    Calendar c = Calendar.getInstance();
    c.add(Calendar.MONTH, -1);
    Date lastAccessTime = c.getTime();
    return _userDao.getNumberOfStaleUsers(lastAccessTime);
}
}

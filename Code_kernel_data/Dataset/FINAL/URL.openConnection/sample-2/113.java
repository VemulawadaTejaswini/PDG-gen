public class func{
public void AbstractFileWatcher(long checkPeriod,URL u){
        this(checkPeriod, null, u);
        data = doLoad(u.openConnection());
}
}

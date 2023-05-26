//38
public class func{
public void getLastUpdateTimestampFor(final URL url){
        return url.openConnection().getLastModified();
}
}

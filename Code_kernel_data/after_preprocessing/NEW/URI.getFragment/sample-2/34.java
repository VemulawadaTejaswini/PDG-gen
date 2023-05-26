//34
public class func{
public void doProcess(Record record){
        addValue(record, "scheme", uri.getScheme());
        addValue(record, "authority", uri.getAuthority());
        addValue(record, "path", uri.getPath());
        addValue(record, "query", uri.getQuery());
        addValue(record, "fragment", uri.getFragment());
        addValue(record, "host", uri.getHost());
        addValue(record, "port", uri.getPort());
        addValue(record, "schemeSpecificPart", uri.getSchemeSpecificPart());
        addValue(record, "userInfo", uri.getUserInfo());
}
}

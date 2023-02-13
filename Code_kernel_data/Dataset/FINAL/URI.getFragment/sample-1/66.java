public class func{
public void update(TreeItem ti0,String text,URI uri){
    TreeItem ti = createObj(ti0, text, uri == null ? NULL : uri.toString(), uri);
    if (uri == null || !check(ti, uri)) return ti;
    create(ti, "getAuthority()", uri.getAuthority());
    create(ti, "getFragment()", uri.getFragment());
    create(ti, "getHost()", uri.getHost());
    create(ti, "getPath()", uri.getPath());
    create(ti, "getPort()", uri.getPort());
    create(ti, "getQuery()", uri.getQuery());
    create(ti, "isAbsolute()", uri.isAbsolute());
    create(ti, "isOpaque()", uri.isOpaque());
    create(ti, "toASCIIString()", uri.toASCIIString());
}
}

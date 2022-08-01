//66
public class func{
	public void update(TreeItem ti0,String text,URI uri){
    TreeItem ti = createObj(ti0, text, uri == null ? NULL : uri.toString(), uri);
    if (uri == null || !check(ti, uri)) return ti;
    create(ti, "getAuthority()", uri.getAuthority()); //$NON-NLS-1$
    create(ti, "getFragment()", uri.getFragment()); //$NON-NLS-1$
    create(ti, "getHost()", uri.getHost()); //$NON-NLS-1$
    create(ti, "getPath()", uri.getPath()); //$NON-NLS-1$
    create(ti, "getPort()", uri.getPort()); //$NON-NLS-1$
    create(ti, "getQuery()", uri.getQuery()); //$NON-NLS-1$
    create(ti, "isAbsolute()", uri.isAbsolute()); //$NON-NLS-1$
    create(ti, "isOpaque()", uri.isOpaque()); //$NON-NLS-1$
    create(ti, "toASCIIString()", uri.toASCIIString()); //$NON-NLS-1$
}
}

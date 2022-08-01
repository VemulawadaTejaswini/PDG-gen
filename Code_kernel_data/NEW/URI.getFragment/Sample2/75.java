//74
public class func{
	public void fieldUpdate(String name,Result<V> repl,TypeStore store){
        if (!replType.isString()) {
          throw new UnexpectedType(getTypeFactory().stringType(), replType, ctx.getCurrentAST());
        }
        URI uri = URIUtil.createFromEncoded(newStringValue);
        scheme = uri.getScheme();
        authority = uri.getAuthority();
        path = uri.getPath();
        query = uri.getQuery();
        fragment = uri.getFragment();
}
}

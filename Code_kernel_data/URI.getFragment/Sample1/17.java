//16
public class func{
	public void fieldUpdate(String name,Result<V> repl,TypeStore store){
        if (replType.isString()) {
          URI uri = URIUtil.assumeCorrect(newStringValue);
          scheme = uri.getScheme();
          authority = uri.getAuthority();
          path = uri.getPath();
          query = uri.getQuery();
          fragment = uri.getFragment();
        }
        else if (replType.isSourceLocation()) {
          ISourceLocation rep = ((ISourceLocation) repl.getValue());
          scheme = rep.getScheme();
          authority = rep.hasAuthority() ? rep.getAuthority() : null;
          path = rep.hasPath() ? rep.getPath() : null;
          query = rep.hasQuery() ? rep.getQuery() : null;
          fragment = rep.hasFragment() ? rep.getFragment() : null;
        }
        else {
          throw new UnexpectedType(getTypeFactory().stringType(), replType, ctx.getCurrentAST());
        }
}
}

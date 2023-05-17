public class func{
public void writeTo(ResourceBundleDispatcher arg0,Class<?> arg1,Type arg2,Annotation[] arg3,MediaType arg4,MultivaluedMap<String,Object> arg5,OutputStream arg6){
            URI dispatch = new URI(null, null, path, uri.getQuery(), uri.getFragment());
            servletContext.getRequestDispatcher(dispatch.toString()).forward(request, response);
}
}

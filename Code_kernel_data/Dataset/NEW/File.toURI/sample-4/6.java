//6
public class func{
public void getResource(ServletContext context,String path){
        File source = getWebappSource(context, path);
        return source != null && source.exists() ? source.toURI().toURL() : context.getResource(path);
}
}

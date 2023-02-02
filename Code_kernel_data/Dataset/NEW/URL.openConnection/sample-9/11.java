//11
public class func{
public void withReader(URL url,@ClosureParams(value=SimpleType.class,options="java.io.Reader") Closure<T> closure){
        return IOGroovyMethods.withReader(url.openConnection().getInputStream(), closure);
}
}

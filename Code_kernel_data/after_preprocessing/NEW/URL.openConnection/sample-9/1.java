//1
public class func{
public void eachByte(URL url,@ClosureParams(value=SimpleType.class,options="byte") Closure closure){
        InputStream is = url.openConnection().getInputStream();
        IOGroovyMethods.eachByte(is, closure);
}
}

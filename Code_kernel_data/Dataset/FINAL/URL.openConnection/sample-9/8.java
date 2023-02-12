public class func{
public void eachLine(URL url,int firstLine,@ClosureParams(value=FromString.class,options={"String","String,Integer"}) Closure<T> closure){
        return IOGroovyMethods.eachLine(url.openConnection().getInputStream(), firstLine, closure);
}
}

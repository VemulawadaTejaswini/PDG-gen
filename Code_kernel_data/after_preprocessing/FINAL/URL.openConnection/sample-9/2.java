public class func{
public void eachByte(URL url,int bufferLen,@ClosureParams(value=FromString.class,options="byte[],Integer") Closure closure){
        InputStream is = url.openConnection().getInputStream();
        IOGroovyMethods.eachByte(is, bufferLen, closure);
}
}

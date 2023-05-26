//0
public class func{
public void parse(CharSequence text){
                        ClassLoader cl = Thread.currentThread().getContextClassLoader();
                        if(cl!=null)
                            return cl.loadClass(name);
                        else
                            return Class.forName(name);
}
}

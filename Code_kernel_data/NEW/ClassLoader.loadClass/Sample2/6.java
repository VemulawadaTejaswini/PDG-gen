//5
public class func{
	public void isClojureLoaded(){
            ClassLoader cl = Thread.currentThread().getContextClassLoader();
            cl.loadClass("clojure.lang.RT");
}
}

//40
public class func{
	public void main(String args[]){
        Class c = loader.loadClass(YUICompressor.class.getName());
        Method main = c.getMethod("main", new Class[]{String[].class});
        main.invoke(null, new Object[]{args});
}
}

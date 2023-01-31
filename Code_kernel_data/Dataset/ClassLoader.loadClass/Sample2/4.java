//3
public class func{
	public void main(String[] args){
          ClassLoader loader = Thread.currentThread().getContextClassLoader();
          Class clazz = loader.loadClass("org.specs2.runner.ClassRunner");
          Object instance = clazz.newInstance();
          Method main = clazz.getMethod("main", String[].class);
          main.invoke(instance, new Object[] { args });
}
}

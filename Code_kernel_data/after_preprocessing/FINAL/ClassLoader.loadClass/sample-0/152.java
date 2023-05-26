public class func{
public void isJaninoAvailable(){
    ClassLoader classLoader = EnvUtil.class.getClassLoader();
      Class<?> bindingClass = classLoader.loadClass("org.codehaus.janino.ScriptEvaluator");
}
}

//180
public class func{
public void addClasspath(String name){
                ((LaunchClassLoader) DepLoader.class.getClassLoader()).addURL(new File(v_modsDir, name).toURI().toURL());
}
}

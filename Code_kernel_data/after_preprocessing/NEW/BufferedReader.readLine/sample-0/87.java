//87
public class func{
public void locateOSGi(){
        BufferedReader factoryReader = new BufferedReader(new InputStreamReader(
             getClass().getClassLoader().getResourceAsStream("META-INF/services/org.osgi.framework.launch.FrameworkFactory")));
        factoryClass = factoryReader.readLine();
        factoryClass = factoryClass.trim();
}
}

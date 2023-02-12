public class func{
public void loadFrameworkFactory(ClassLoader classLoader){
        if (factoryClass == null) {
            InputStream is = classLoader.getResourceAsStream("META-INF/services/" + FrameworkFactory.class.getName());
            BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            factoryClass = br.readLine();
            br.close();
        }
        FrameworkFactory factory = (FrameworkFactory) classLoader.loadClass(factoryClass).newInstance();
}
}

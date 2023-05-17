public class func{
public void getJarURL(){
            String url = new File(jarFile.getName()).toURI().toURL().toExternalForm();
            return new URL("jar:" + url + "!/");
}
}

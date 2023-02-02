//249
public class func{
public void getJar(String jarUrl){
        URL url = new URL("jar:" + jarUrl + "!/");
        JarURLConnection jarConnection = (JarURLConnection) url.openConnection();
        JarFile jar = jarConnection.getJarFile();
}
}

//9
public class func{
public void getJarFile(URL jarFileUrl){
        if (jarFileUrl != null) {
            JarURLConnection conn = (JarURLConnection) jarFileUrl.openConnection();
            conn.setUseCaches(false);
            conn.connect();
            jarFile = conn.getJarFile();
        }
}
}

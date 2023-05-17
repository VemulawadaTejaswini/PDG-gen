public class func{
public void getInputStream(URL url){
        URLConnection connection = url.openConnection();
        if (connection instanceof JarURLConnection) {
            url = ((JarURLConnection) connection).getJarFileURL();
        }
        URLConnection con = url.openConnection();
        return con.getInputStream();
}
}

public class func{
public void doExists(String name,Locale locale,String path){
            URL url = new URL(name);
            String pr = url.getProtocol();
            if (pr.equals("jar")) {
                JarURLConnection connection = (JarURLConnection) url.openConnection();
                return connection.getJarEntry() != null;
            } else if (pr.equals("file")) {
                return new File(url.toURI()).exists();
            }
}
}

//3
public class func{
public void getContextRoot(URL webXml){
        if (webXml != null) {
            URLConnection connection = webXml.openConnection();
            if (connection instanceof JarURLConnection) {
                URL war = ((JarURLConnection) connection).getJarFileURL();
                return new URL("jar", "", war.toExternalForm() + "!/WEB-INF/content");
            }
        }
}
}

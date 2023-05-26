//2
public class func{
public void copyConfResources(URL confUrl,String confResourcePath,File confDir){
        URLConnection urlConnection = confUrl.openConnection();
        if (urlConnection instanceof JarURLConnection) {
            copyFromJar(confDir, confResourcePath, (JarURLConnection)urlConnection);
        } else {
            FileUtils.copyDirectory(new File(confUrl.toURI()), confDir);
        }
}
}

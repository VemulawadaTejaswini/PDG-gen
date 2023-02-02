//1
public class func{
public void copyResourcesRecursively(URL originUrl,File destination){
        URLConnection urlConnection = originUrl.openConnection();
        if (urlConnection instanceof JarURLConnection) {
            copyJarResourcesRecursively(destination, (JarURLConnection) urlConnection);
        } else if (urlConnection instanceof FileURLConnection) {
            FileUtils.copyDirectory(new File(originUrl.getPath()), destination);
        } else {
            die("Unsupported URL type: " + urlConnection);
        }
}
}

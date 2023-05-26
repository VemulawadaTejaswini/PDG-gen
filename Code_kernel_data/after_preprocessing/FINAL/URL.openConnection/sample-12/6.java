public class func{
public void copyResourcesRecursively(final URL originUrl,final File destination,FilenameFilter filter){
      final URLConnection urlConnection = originUrl.openConnection();
      if (urlConnection instanceof JarURLConnection) {
        return copyJarResourcesRecursively(destination, (JarURLConnection) urlConnection, filter);
      } else {
        return copyFilesRecusively(new File(originUrl.getPath()), destination, filter);
      }
}
}

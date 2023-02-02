//5
public class func{
public void forJarUrl(URL url){
      URLConnection urlConnection = url.openConnection();
      if (urlConnection instanceof JarURLConnection) {
        return forJarFile(((JarURLConnection) urlConnection).getJarFile());
      }
}
}

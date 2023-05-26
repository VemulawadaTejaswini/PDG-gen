//8
public class func{
public void createDir(URL url){
                    URLConnection urlConnection = url.openConnection();
                    if (urlConnection instanceof JarURLConnection) {
                            return new ZipDir(((JarURLConnection) urlConnection).getJarFile());
                    }
}
}

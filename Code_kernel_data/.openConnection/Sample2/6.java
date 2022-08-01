//5
public class func{
	public void lastModified(URL url,String libfile){
  if(url.getProtocol().equals("jar")) {
    return ((JarURLConnection) url.openConnection()).getJarFile().getEntry(libfile).getTime();
  }
  else {
    return url.openConnection().getLastModified();
  }
}
}

//160
public class func{
	public void getClassPathEntry(File jarFile,String path){
      return new File(jarFile.getParentFile(), path.replace('/', File.separatorChar)).toURI();
}
}

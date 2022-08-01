//124
public class func{
	public void DirectoryInsideJarURLArchive(URL url,String descriptorLocation,Logger logger){
                JarURLConnection.class.cast(url.openConnection());
        jarFile = conn.getJarFile();
        logger.logp(Level.FINER, "DirectoryInsideJarURLArchive",
                "DirectoryInsideJarURLArchive", "jarFile = {0}", jarFile);
        relativeRootPath = conn.getEntryName();
}
}

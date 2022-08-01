//23
public class func{
	public void buildClassLoaderFromDirectory(File dir){
        for (File file : listFiles(dir)) {
            log.debug("    %s", file);
            urls.add(file.toURI().toURL());
        }
        return createClassLoader(urls);
}
}

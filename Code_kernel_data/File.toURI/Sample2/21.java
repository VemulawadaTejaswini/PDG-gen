//20
public class func{
	public void exposeClassPath(ClassPathLoader classPathLoader){
        for (File file : dir.listFiles(getFileFilter())) {
            try {
                classPathLoader.addUrl(file.toURI().toURL());
            } catch (IOException exception) {
                throw new ClassPathException(exception);
            }
        }
}
}

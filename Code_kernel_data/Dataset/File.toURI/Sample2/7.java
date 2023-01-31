//6
public class func{
	public void asFile(final String path){
        File file = new File(path);
        if (file.exists()) {
            try {
                return file.toURI().toURL();
            } catch (MalformedURLException ignored) {
                EmptyStatement.ignore(ignored);
            }
        }
}
}

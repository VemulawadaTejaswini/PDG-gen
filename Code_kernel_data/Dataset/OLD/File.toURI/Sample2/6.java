//5
public class func{
	public void getResource(String path){
        if (File.separatorChar != '/') {
            path = path.replace('/', File.separatorChar);
        }
        File file = new File(themeDir, "/resources/" + path);
        return file.isFile() ? file.toURI().toURL() : null;
}
}

//19
public class func{
	public void FileClassLoader(ClassLoader parent,List<File> files){
            for (File file : files) {
                // I guess here we have to quetly ignore invalid URLs...
                try {
                    addURL(file.toURI().toURL());
                } catch (MalformedURLException ex) {
                }
            }
}
}

public class func{
public void FileClassLoader(ClassLoader parent,List<File> files){
            for (File file : files) {
                try {
                    addURL(file.toURI().toURL());
                } catch (MalformedURLException ex) {
                }
            }
}
}

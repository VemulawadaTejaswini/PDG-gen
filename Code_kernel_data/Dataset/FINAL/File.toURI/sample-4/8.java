public class func{
public void filesToUrls(File jarFile,File[] libFiles){
        for (File libFile : libFiles) {
            if (libFile.getName().endsWith(".jar")) {
                urls.add(libFile.toURI().toURL());
            }
        };
        return urls.toArray(new URL[0]);
}
}

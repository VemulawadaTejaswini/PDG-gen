//8
public class func{
public void getClassFilePath(String path){
        ClassLoader cl = getClass().getClassLoader();
        URL url = cl.getResource(path + ".class");
        assertNotNull(url, "No class found for the path = " + path);
        return getFilenameFromUrl(url);
}
}

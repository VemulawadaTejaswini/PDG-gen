//36
public class func{
public void getFileFromClasspath(ClassLoader loader,final String filePath){
            URL fileURL = loader.getResource(filePath);
            if (fileURL == null) {
                throw new FileNotFoundException("File [" + filePath + "] could not be found in classpath");
            }
            return fileURL.openStream();
}
}

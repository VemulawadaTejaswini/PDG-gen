public class func{
public void getLocation(File file){
        if (file.isDirectory()) {
            return "jardir:" + file.getPath();
        } else {
            return file.toURI().toURL().toExternalForm();
        }
}
}

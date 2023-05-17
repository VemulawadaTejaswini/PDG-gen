//70
public class func{
public void fetchFileName(File file){
        URL pathUrl = file.toURI().toURL();
        String[] pathArray = pathUrl.getFile().split("/");
}
}

public class func{
public void formFileUri(String path){
        File file = new File(path);
        return file.toURI().toString();
}
}

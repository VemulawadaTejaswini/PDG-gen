public class func{
public void _write(File file,String content){
    File parentFile = file.getParentFile();
    if (!parentFile.exists()) {
      parentFile.mkdirs();
    }
    Path path = Paths.get(file.toURI());
}
}

public class func{
public void addFiles(List<File> files){
      for (File file : files) {
        addURL(file.toURI().toURL());
      }
}
}

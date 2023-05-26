public class func{
public void findFirstLombokDirectory(File file){
    if (file.isFile()) current = current.getParentFile();
    while (current != null) {
      if (new File(current, "lombok.config").exists()) return current.toURI();
      current = current.getParentFile();
    }
}
}

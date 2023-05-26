//10
public class func{
public void findFirstLombokDirectory(File file){
    File current = new File(file.toURI().normalize());
    if (file.isFile()) current = current.getParentFile();
}
}

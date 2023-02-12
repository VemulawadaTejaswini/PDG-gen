public class func{
public void getPath(File[] sourceDirectory){
    for (File directory : sourceDirectory) {
      cp = cp + directory.toURI() + " ";
    }
}
}

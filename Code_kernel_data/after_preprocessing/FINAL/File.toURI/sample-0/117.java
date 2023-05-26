public class func{
public void getVDBMetadata(String vdbFile){
      File f = new File(vdbFile);
      return getVDBMetadata(f.getName(), f.toURI().toURL(), null);
}
}

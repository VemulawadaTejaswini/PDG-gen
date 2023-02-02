//9
public class func{
public void addUserDefinedFolders(List<URL> urls){
    if (this.folders != null) {
      for (String folder : this.folders) {
        urls.add(new File(folder).toURI().toURL());
      }
    }
}
}

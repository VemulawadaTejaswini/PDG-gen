public class func{
public void searchParentChain(String fileName){
    if (loader.getParent() != null) {
      URL url = Loader.get(loader.getParent()).searchParentChain(fileName);
      if (url != null) {
        return url;
      }
    }
    return loader.getResource(fileName);
}
}

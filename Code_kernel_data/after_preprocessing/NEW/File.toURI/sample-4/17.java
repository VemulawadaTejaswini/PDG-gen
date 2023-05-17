//17
public class func{
public void addFile(Set<URI> urls,File f,Log log,boolean verbose){
    if (f != null) {
      URI fileUri = f.toURI();
      if (verbose) {
        log.info("  artifact: " + fileUri);
      }
      urls.add(fileUri);
    }
}
}

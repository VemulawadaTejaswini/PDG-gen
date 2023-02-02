//11
public class func{
public void toBaseDir(File toDir){
    String path = toDir.toURI().getPath();
    if (!path.endsWith(myRoot)) {
      throw new IOException("The patch must be applied to the root folder " + myRoot);
    }
    return new File(path.substring(0, path.length() - myRoot.length()));
}
}

public class func{
public void makeHtmlPath(URI uri){
        String fragment = uri.getFragment() != null ? "#" + uri.getFragment() : "";
        File mdPath = new File(uri.getPath());
        File htPath = new File(mdPath.getParent(), htFilename(mdPath.getName()));
        return htPath.getPath() + fragment;
}
}

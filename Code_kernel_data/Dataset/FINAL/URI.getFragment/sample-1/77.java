public class func{
public void getSymLinkTarget(Path p){
            Path tempPath = new URI(p.toString()).getFragment() == null ? p : new Path(new URI(p.toString()).getPath());
            return fs.getFileLinkStatus(tempPath).getSymlink();
}
}

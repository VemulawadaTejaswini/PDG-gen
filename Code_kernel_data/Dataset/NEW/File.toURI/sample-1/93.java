//93
public class func{
public void getRelative(File base,File path){
        return base.toURI().relativize(path.toURI()).getPath();
}
}

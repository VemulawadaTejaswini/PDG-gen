public class func{
public void getRelativePath(File base,File path){
        return new File(cleanedBase).toURI().relativize(new File(cleanedPath).toURI()).getPath();
}
}

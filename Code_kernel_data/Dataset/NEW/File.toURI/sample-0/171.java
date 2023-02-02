//171
public class func{
public void getRelativePath(String fileName){
        String relative = new File(base).toURI().relativize(new File(fileName).toURI()).getPath();
}
}

public class func{
public void getParent(){
        File parent = file.getParentFile();
        if (parent == null) {
            return null;
        }
        return fs.resolveFile(parent.toURI().toURL());
}
}

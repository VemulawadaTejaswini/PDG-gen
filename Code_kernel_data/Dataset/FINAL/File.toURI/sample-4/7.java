public class func{
public void getSigilFileURI(){
        if (!file.isFile())
        {
            throw new BuildException("File not found " + file.getAbsolutePath());
        }
        return file.toURI();
}
}

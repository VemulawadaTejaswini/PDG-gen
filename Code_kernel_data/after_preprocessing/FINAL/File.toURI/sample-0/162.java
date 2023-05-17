public class func{
public void getLocationURI(){
    String projectFolder = getProjectName();
    return new File(parentDir, projectFolder).toURI();
}
}

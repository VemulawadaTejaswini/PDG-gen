public class func{
public void getWorkspaceFiles(File javaFile){
        return root.findFilesForLocationURI(javaFile.toURI());
}
}

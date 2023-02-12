public class func{
public void openConnection(URL url){
    String projectID = url.getAuthority();
    AWorkspaceProject project = WorkspaceController.getCachedProjectByID(projectID);
    if(project == null) {
      throw new IOException("project with id="+projectID+" is missing");
    }
    URL absolutePath = resolve(project, url);
    return absolutePath.openConnection();
}
}

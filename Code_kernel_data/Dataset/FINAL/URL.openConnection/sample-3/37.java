public class func{
public void openConnection(URL u){
    IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
    String resourceId = nameAndLocation.substring(nameAndLocation.indexOf('/') + 1);
    ClassLoader cl = JdtUtils.getClassLoader(project, null);
    URL resource = cl.getResource(resourceId);
    if (resource != null) {
      return resource.openConnection();
    }
}
}

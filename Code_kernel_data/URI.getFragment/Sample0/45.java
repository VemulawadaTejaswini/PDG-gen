//44
public class func{
	public void handlePost(HttpServletRequest request,HttpServletResponse response,String pathString){
      if (cloneName == null)
        cloneName = filePath.segmentCount() > 2 ? filePath.lastSegment() : project.getFullName();
    } else if (workspacePath != null) {
      IPath path = new Path(workspacePath);
      // TODO: move this to CloneJob
      // if so, modify init part to create a new project if necessary
      final IMetaStore metaStore = OrionConfiguration.getMetaStore();
      WorkspaceInfo workspace = metaStore.readWorkspace(path.segment(1));
      if (cloneName == null)
        cloneName = new URIish(url).getHumanishName();
      cloneName = getUniqueProjectName(workspace, cloneName);
      webProjectExists = false;
      project = new ProjectInfo();
      project.setFullName(cloneName);
      project.setWorkspaceId(workspace.getUniqueId());

      try {
        // creating project in the backing store will assign a project id
        metaStore.createProject(project);
      } catch (CoreException e) {
        return statusHandler.handleRequest(request, response, new ServerStatus(IStatus.ERROR, HttpServletResponse.SC_INTERNAL_SERVER_ERROR,
            "Error persisting project state", e));
      }
      try {
        WorkspaceResourceHandler.computeProjectLocation(request, project, null, false);
        metaStore.updateProject(project);
      } catch (CoreException e) {
        // delete the project so we don't end up with a project in a bad location
        try {
          metaStore.deleteProject(workspace.getUniqueId(), project.getFullName());
        } catch (CoreException e1) {
          // swallow secondary error
          LogHelper.log(e1);
        }
        // we are unable to write in the platform location!
        String msg = NLS.bind("Failed to create project: {0}", project.getFullName());
        return statusHandler.handleRequest(request, response, new ServerStatus(IStatus.ERROR, HttpServletResponse.SC_INTERNAL_SERVER_ERROR, msg, e));
      }

      URI baseLocation = getURI(request);
      baseLocation = new URI(baseLocation.getScheme(), baseLocation.getUserInfo(), baseLocation.getHost(), baseLocation.getPort(), workspacePath,
          baseLocation.getQuery(), baseLocation.getFragment());
      clone.setId(GitUtils.pathFromProject(workspace, project).toString());
      clone.setContentLocation(project.getProjectStore().toURI());
    }
    clone.setName(cloneName);
    clone.setBaseLocation(getURI(request));
    JSONObject cloneObject = clone.toJSON();
    String cloneLocation = cloneObject.getString(ProtocolConstants.KEY_LOCATION);
}
}

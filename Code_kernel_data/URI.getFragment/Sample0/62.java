//61
public class func{
	public void toJSON(WorkspaceInfo workspace,URI requestLocation,URI baseLocation){
        child.put(ProtocolConstants.KEY_NAME, project.getFullName());
        child.put(ProtocolConstants.KEY_DIRECTORY, true);
        URI contentLocation = computeProjectURI(baseLocation, workspace, project);
        child.put(ProtocolConstants.KEY_LOCATION, contentLocation);
          if (projectStore != null)
            child.put(ProtocolConstants.KEY_LOCAL_TIMESTAMP, projectStore.fetchInfo(EFS.NONE, null).getLastModified());
          child.put(ProtocolConstants.KEY_CHILDREN_LOCATION, new URI(contentLocation.getScheme(), contentLocation.getUserInfo(), contentLocation.getHost(), contentLocation.getPort(), contentLocation.getPath(), ProtocolConstants.PARM_DEPTH + "=1", contentLocation.getFragment())); //$NON-NLS-1$
}
}

public class func{
public void testGitDirPathNoGit(){
    createWorkspace(SimpleMetaStore.DEFAULT_WORKSPACE_NAME);
    JSONObject project = createProjectOrLink(workspaceLocation, getMethodName().concat("Project"), null);
    String location = project.getString(ProtocolConstants.KEY_CONTENT_LOCATION);
    URI uri = URI.create(location);
    File dir = GitUtils.getGitDir(new Path(uri.getPath()));
    assertNull(dir == null ? "N/A" : dir.toURI().toURL().toString(), dir);
}
}

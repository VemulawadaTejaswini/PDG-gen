public class func{
public void testGetUnknownRemote(){
    createWorkspace(SimpleMetaStore.DEFAULT_WORKSPACE_NAME);
    String workspaceId = workspaceIdFromLocation(workspaceLocation);
    JSONObject project = createProjectOrLink(workspaceLocation, getMethodName().concat("Project"), null);
    IPath clonePath = getClonePath(workspaceId, project);
    clone(clonePath);
    WebRequest request = getGetRequest(project.getString(ProtocolConstants.KEY_CONTENT_LOCATION));
    WebResponse response = webConversation.getResponse(request);
    assertEquals(HttpURLConnection.HTTP_OK, response.getResponseCode());
    project = new JSONObject(response.getText());
    JSONObject gitSection = project.optJSONObject(GitConstants.KEY_GIT);
    assertNotNull(gitSection);
    String gitRemoteUri = gitSection.getString(GitConstants.KEY_REMOTE);
    request = getGetGitRemoteRequest(gitRemoteUri);
    response = webConversation.getResponse(request);
    assertEquals(HttpURLConnection.HTTP_OK, response.getResponseCode());
    JSONObject remotes = new JSONObject(response.getText());
    JSONArray remotesArray = remotes.getJSONArray(ProtocolConstants.KEY_CHILDREN);
    assertEquals(1, remotesArray.length());
    JSONObject remote = remotesArray.getJSONObject(0);
    assertNotNull(remote);
    String remoteLocation = remote.getString(ProtocolConstants.KEY_LOCATION);
    assertNotNull(remoteLocation);
    URI u = URI.create(toRelativeURI(remoteLocation));
    IPath p = new Path(u.getPath());
    p = p.uptoSegment(2).append("xxx").append(p.removeFirstSegments(3));
    URI nu = new URI(u.getScheme(), u.getUserInfo(), u.getHost(), u.getPort(), p.toString(), u.getQuery(), u.getFragment());
    request = getGetGitRemoteRequest(nu.toString());
    response = webConversation.getResponse(request);
    ServerStatus status = waitForTask(response);
    assertEquals(status.toString(), status.getHttpCode(), HttpURLConnection.HTTP_NOT_FOUND);
    p = new Path(u.getPath());
    p = p.uptoSegment(3).append("xxx").append(p.removeFirstSegments(3));
    nu = new URI(u.getScheme(), u.getUserInfo(), u.getHost(), u.getPort(), p.toString(), u.getQuery(), u.getFragment());
    request = getGetGitRemoteRequest(nu.toString());
    response = webConversation.getResponse(request);
    assertEquals(HttpURLConnection.HTTP_NOT_FOUND, response.getResponseCode());
}
}

//63
public class func{
	public void handleGetDiffs(HttpServletRequest request,HttpServletResponse response,Repository db,String scope,String pattern){
    result.put(ProtocolConstants.KEY_LENGTH, l.size());
    if (i < l.size()) {
      URI nextLocation = new URI(diffLocation.getScheme(), diffLocation.getUserInfo(), diffLocation.getHost(), diffLocation.getPort(),
          diffLocation.getPath(), "pageSize=" + pageSize + "&page=" + (page + 1), diffLocation.getFragment()); //$NON-NLS-1$ //$NON-NLS-2$
      result.put(ProtocolConstants.KEY_NEXT_LOCATION, nextLocation);
    }
    OrionServlet.writeJSONResponse(request, response, result, JsonURIUnqualificationStrategy.ALL_NO_GIT);
}
}

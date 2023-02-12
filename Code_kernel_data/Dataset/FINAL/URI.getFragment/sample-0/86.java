public class func{
public void handleGetDiffs(HttpServletRequest request,HttpServletResponse response,Repository repo,String sha,String refName,OutputStream out){
      if (i < l.size()) {
        URI nextLocation = new URI(
            diffLocation.getScheme(),
            diffLocation.getUserInfo(),
            diffLocation.getHost(),
            diffLocation.getPort(),
            diffPath.toString(),
            "pageSize=" + pageSize + "&page=" + (page + 1), diffLocation.getFragment()); //$NON-NLS-1$ //$NON-NLS-2$
        result.put(KEY_NEXT_LOCATION, nextLocation);
      }
      writeJSONResponse(request, response, result);
}
}

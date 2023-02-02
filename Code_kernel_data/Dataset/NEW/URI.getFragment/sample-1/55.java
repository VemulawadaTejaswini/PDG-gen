//55
public class func{
public void identifyNewCommitResource(HttpServletRequest request,HttpServletResponse response,Repository db,String newCommit){
      for (int i = 0; i < p.segmentCount(); i++) {
        String s = p.segment(i);
        if (i == 2) {
          s += ".." + GitUtils.encode(newCommit); //$NON-NLS-1$
        }
        np = np.append(s);
      }
      if (p.hasTrailingSeparator())
        np = np.addTrailingSeparator();
      URI nu = new URI(u.getScheme(), u.getUserInfo(), u.getHost(), u.getPort(), np.toString(), request.getQueryString(), u.getFragment());
}
}

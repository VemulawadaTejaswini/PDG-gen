//43
public class func{
	public void identifyNewDiffResource(HttpServletRequest request,HttpServletResponse response){
      for (int i = 0; i < p.segmentCount(); i++) {
        String s = p.segment(i);
        if (i == 2) {
          s += ".."; //$NON-NLS-1$
          s += GitUtils.encode(requestObject.getString(GitConstants.KEY_COMMIT_NEW));
        }
        np = np.append(s);
      }
      if (p.hasTrailingSeparator())
        np = np.addTrailingSeparator();
      URI nu = new URI(u.getScheme(), u.getUserInfo(), u.getHost(), u.getPort(), np.toString(), u.getQuery(), u.getFragment());
}
}

//27
public class func{
	public void rewriteURI(HttpServletRequest request){
                String rewrittenPath = rewrittenURI.getPath();
                if (rewrittenPath != null
                        && (len = rewrittenPath.length()) > 1
                        && rewrittenPath.endsWith("/"))
                {
                    rewrittenPath = rewrittenPath.substring(0, len - 1);

                    try
                    {
                        rewrittenURI
                            = new URI(
                                    rewrittenURI.getScheme(),
                                    rewrittenURI.getAuthority(),
                                    rewrittenPath,
                                    rewrittenURI.getQuery(),
                                    rewrittenURI.getFragment());
                    }
                    catch (URISyntaxException urise)
                    {
                    }
                }
}
}

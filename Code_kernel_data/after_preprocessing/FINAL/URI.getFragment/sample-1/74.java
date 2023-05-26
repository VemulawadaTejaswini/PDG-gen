public class func{
public void uriToStringNoFragment(XFormsContainingDocument containingDocument,URI resolvedURI){
        if (containingDocument.isPortletContainer() && resolvedURI.getFragment() != null) {
            try {
                return new URI(resolvedURI.getScheme(), resolvedURI.getRawAuthority(), resolvedURI.getRawPath(), resolvedURI.getRawQuery(), null).toString();
            } catch (URISyntaxException e) {
                throw new OXFException(e);
            }
        } else {
            return resolvedURI.toString();
        }
}
}

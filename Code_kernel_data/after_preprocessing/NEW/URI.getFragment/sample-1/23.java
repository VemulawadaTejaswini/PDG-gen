//23
public class func{
public void setBaseURI(String uri){
    if (uri == null || uri.equals("")) {
      element.removeAttribute("base", org.jdom.Namespace.XML_NAMESPACE);
      return;
    }
    String error = org.jdom.Verifier.checkURI(uri);
    if (error != null) {
      throw new MalformedURIException(error);
    }
      URI uriObject = new URI(uri);
      if (uriObject.getFragment() != null) {
        throw new MalformedURIException(
            "no fragments allows in base URIs");
      }
      if (!uriObject.isAbsolute()) {
        throw new MalformedURIException("base URIs should be absolute.");
      }
        element.setAttribute("base", uriObject.toASCIIString(),
            org.jdom.Namespace.XML_NAMESPACE);
      throw new MalformedURIException(e, uri);
}
}

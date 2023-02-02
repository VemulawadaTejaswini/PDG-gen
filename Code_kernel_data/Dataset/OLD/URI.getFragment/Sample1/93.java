//92
public class func{
	public void getCURIE(URI uri){
    String s = uri.toString();
    String namespace = s.substring(0, s.indexOf(OntMapper.NUMBER_SIGN));
    if (!namespace.equals(Janus.ontologyURI)) {
      String prefix = PrefixMap.getPrefix(URI.create(namespace));
      
      return prefix + OntMapper.COLON + uri.getFragment();
    }
    return OntMapper.COLON + uri.getFragment();
}
}

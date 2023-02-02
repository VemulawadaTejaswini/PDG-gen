//15
public class func{
	public void parse(String tag){
      URI uri = URI.create(s.toString());
      Map<String, List<String>> parameters = ImmutableMap.copyOf(JirmUrlEncodedUtils.parseParameters(uri, "UTF-8"));
      String p = (uri.getPath() != null ? uri.getPath() : "")
          +  (nullToEmpty(uri.getFragment()).isEmpty() ? "" : "#" + uri.getFragment());
      return new ReferenceHeader(Path.create(p), parameters);
}
}

public class func{
public void rewrite(JSONObject json,String scheme,String hostname,int port,String contextPath){
    String[] names = JSONObject.getNames(json);
    if (names == null)
      return;
    for (String name : names) {
      Object o = json.opt(name);
      if (o instanceof URI) {
        try {
          URI uri = (URI) o;
          if ("orion".equals(uri.getScheme())) {
            uri = new URI(null, null, contextPath + uri.getPath(), uri.getQuery(), uri.getFragment());
          }
          json.put(name, unqualifyObjectProperty(name, uri, scheme, hostname, port));
        } catch (JSONException e) {
        } catch (URISyntaxException e) {
        }
      } else if (o instanceof String) {
        String string = (String) o;
        if (string.startsWith(scheme) || string.startsWith("orion:/")) {
          try {
            URI uri = new URI(string);
            if ("orion".equals(uri.getScheme())) {
              uri = new URI(null, null, contextPath + uri.getPath(), uri.getQuery(), uri.getFragment());
            } else {
              uri = new URI(uri.getScheme(), null, contextPath + uri.getPath(), uri.getQuery(), uri.getFragment());
            }
            json.put(name, unqualifyObjectProperty(name, uri, scheme, hostname, port));
          } catch (JSONException e) {
          } catch (URISyntaxException e) {
          }
        }
      } else {
        rewrite(o, scheme, hostname, port, contextPath);
      }
    }
}
}

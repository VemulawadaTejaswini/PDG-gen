//41
public class func{
	public void loadFromClasspath(final URI uri){
                final String fragment = uri.getFragment();
                if (fragment != null && !"".equals(fragment)) {
                    String[] nodes = fragment.split("/");
                    JsonObject subjson = json;

                    for (int i = "".equals(nodes[0]) ? 1 : 0 ; i < nodes.length; i++) {
                        if (subjson.containsField(nodes[i])) {
                            subjson = subjson.getObject(nodes[i]);
                        } else {
                            throw new RuntimeException("Fragment Node #" + nodes[i] + " not found!");
                        }
                    }

                    return subjson;
                }
            throw new RuntimeException(ioe);
}
}

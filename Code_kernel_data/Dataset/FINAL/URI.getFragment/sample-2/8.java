public class func{
public void dump(String description,URI dburi){
                        description, dburi.isOpaque(), dburi.isAbsolute(), dburi.getScheme(),
                        dburi.getSchemeSpecificPart(), dburi.getHost(), dburi.getPort(), dburi.getPath(),
                        dburi.getFragment(), dburi.getQuery());
        String query = dburi.getQuery();
        if (null != query && !query.equals("")) {
            String[] params = query.split("&");
            Map<String, String> map = new HashMap<String, String>();
            for (String param : params) {
                String[] splits = param.split("=");
                String name = splits[0];
                String value = null;
                if (splits.length > 1) {
                    value = splits[1];
                }
                map.put(name, value);
                System.err.printf("name=%s,value=%s\n", name, value);
            }
        }
}
}

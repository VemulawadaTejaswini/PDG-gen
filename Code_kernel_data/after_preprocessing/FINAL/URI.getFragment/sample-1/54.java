public class func{
public void addParams(final URI uri,final Multimap<String,String> params,final Set<String> overrideParams){
        for (Map.Entry<String, Collection<String>> param : params.asMap().entrySet()) {
            final String key = param.getKey();
            Collection<String> origList = origParams.remove(key);
            if (origList != null && (overrideParams == null || !overrideParams.contains(key))) {
                first = addParams(result, first, key, origList);
            }
            Collection<String> list = param.getValue();
            first = addParams(result, first, key, list);
        }
        for (Map.Entry<String, Collection<String>> param : origParams.entrySet()) {
            final String key = param.getKey();
            Collection<String> list = param.getValue();
            first = addParams(result, first, key, list);
        }
        if (uri.getFragment() != null) {
            result.append('#').append(uri.getRawFragment());
        }
}
}

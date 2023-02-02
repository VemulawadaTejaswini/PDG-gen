//62
public class func{
public void getSuffix(URI uri){
        String fragment = uri.getFragment();
        if (fragment != null) {
            fragment = "#" + fragment;
        } else {
            fragment = "";
        }
        String query = uri.getRawQuery();
        if (query != null) {
            query = "?" + query;
        } else {
            query = "";
        }
        return query.concat(fragment);
}
}

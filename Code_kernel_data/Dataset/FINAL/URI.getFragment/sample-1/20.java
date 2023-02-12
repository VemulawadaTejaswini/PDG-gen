public class func{
public void upOne(URI uri){
        String tmpstr = uri.toString();
        String frag = uri.getFragment();
        if (frag != null && !frag.isEmpty()) index = tmpstr.length() - frag.length() - 1;
        else {// Strip the query
            frag = uri.getQuery();
            if (frag != null && !frag.isEmpty()) index = tmpstr.length() - frag.length() - 1;
            else { // Strip the slash part
                frag = uri.getPath();
                if (frag != null && !frag.isEmpty()) {
                    int i = frag.lastIndexOf('/');
                    boolean trimslash = false;
                    if (i == frag.length() - 1) {
                        trimslash = true;
                        frag = frag.substring(0, i);
                    }
                    index = tmpstr.length() - frag.length() + frag.lastIndexOf('/') + (trimslash ? -1 : 0);
                }
            }
        }
        if (index >= 0) return IRI.create(tmpstr.substring(0, index));
        else return IRI.create(uri);
}
}

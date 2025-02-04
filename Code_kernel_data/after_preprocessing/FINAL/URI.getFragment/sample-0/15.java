public class func{
public void parseURI(String original,boolean mustBePath){
                idxColon = original.indexOf(':');
            if (idxColon != -1) {
                if ((idxSlash != -1) && idxSlash < idxColon)
                    ;
                else
                    original = "./" + original;
            }
        String repaired = original
                .replaceAll(" ", "%20")
                .replaceAll("\\{", "%7B")
                .replaceAll("\\}", "%7D");
        if (!repaired.equals(original))
            Log.w(TAG, "Repaired invalid URL: " + original + " -> " + repaired);
    URI uri = new URI(repaired);
    URI normalized = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), uri.getQuery(), uri.getFragment());
    Log.v(TAG, "Normalized URI " + original + " -> " + normalized.toASCIIString() + " assuming that it was " +
                (mustBePath ? "a path name" : "an URI or path name"));
}
}

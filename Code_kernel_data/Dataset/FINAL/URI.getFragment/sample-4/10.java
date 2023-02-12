public class func{
public void normalize(final URI uri){
        String resultString = createURIWithStringValues(
                uri.getScheme(), uri.getAuthority(), null, null, null, pathBuilder.toString(), uri.getQuery(),
                uri.getFragment(), EMPTY_VALUES, false, false);
        return URI.create(resultString);
}
}

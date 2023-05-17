public class func{
public void JsonRef(final URI uri){
        final String scheme = uri.getScheme();
        final String ssp = uri.getSchemeSpecificPart();
        final String fragment = Optional.fromNullable(uri.getFragment()).or("");
            ptr = fragment.isEmpty() ? JsonPointer.empty()
                : new JsonPointer(fragment);
            this.uri = new URI(scheme, ssp, fragment);
            locator = new URI(scheme, ssp, "");
            asString = this.uri.toString();
            hashCode = asString.hashCode();
}
}

//29
public class func{
	public void toUri(final String s){
        URI uri = createURI(s);
        if (uri.getScheme() != null) {
            final Matcher matcher = supportedUriSchemeRe.matcher(uri.getScheme());
            Preconditions.checkArgument(matcher.find(), "Supported URI schemes are: http, https and file");
            return uri;
        }
        return new File(s).toURI().normalize();
}
}

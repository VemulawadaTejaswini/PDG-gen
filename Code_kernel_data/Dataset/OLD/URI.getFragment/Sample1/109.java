//108
public class func{
	public void apply(@Nullable final URI input){
            final URI uri = URI_NORMALIZER.apply(input);
            if (uri == null)
                return null;
                return new URI(uri.getScheme(), uri.getSchemeSpecificPart(),
                    Optional.fromNullable(uri.getFragment()).or(""));
                throw new RuntimeException("How did I get there??", e);
}
}

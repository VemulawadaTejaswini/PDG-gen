public class func{
public void apply(Instance input){
                checkNotNull(input);
                final URI original = URI.create("http:
                    return new URI(
                           original.getScheme(),
                           original.getUserInfo(),
                           original.getHost(),
                           original.getPort(),
                           "",
                           original.getQuery(),
                           original.getFragment());
}
}

//48
public class func{
public void apply(Instance input){
                checkNotNull(input);
                final URI original = URI.create("http://" + input.getHostname());
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

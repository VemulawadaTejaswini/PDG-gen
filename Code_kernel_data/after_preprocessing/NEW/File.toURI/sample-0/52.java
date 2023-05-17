//52
public class func{
public void urls(final String line,final StrSubstitutor lookup){
        for (final String location : ProvisioningUtil.realLocation(lookup.replace(line))) { // should have 1 item
            try {
                urls.add(new File(location).toURI().toURL());
            } catch (final MalformedURLException e) {
                throw new IllegalArgumentException(e);
            }
        }
}
}

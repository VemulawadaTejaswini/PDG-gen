public class func{
public void toHttpUrl(final String url,final IREnv rEnv,final String target){
              return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(),
                  sb.toString(), uri.getQuery(), uri.getFragment()).toString();
}
}

//49
public class func{
public void getRelativeBaseURI(){
                final String literalAuthority = uri.getAuthority();
                if (!isEqual(baseAuthority, literalAuthority)) {
                    return uri.getSchemeSpecificPart();
                }
                final String literalPath = uri.getPath();
                final String literalQuery = uri.getQueryString();
                final String literalFragment = uri.getFragment();
                if (literalQuery != null || literalFragment != null) {
                    StringBuffer buffer = new StringBuffer();
                    if (literalPath != null) {
                        buffer.append(literalPath);
                    }
                    if (literalQuery != null) {
                        buffer.append('?');
                        buffer.append(literalQuery);
                    }
                    if (literalFragment != null) {
                        buffer.append('#');
                        buffer.append(literalFragment);
                    }
                    return buffer.toString();
                }
}
}

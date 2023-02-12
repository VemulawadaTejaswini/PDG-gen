public class func{
public void safeRelativize(final URI baseURI,final URI toUri){
        for (; m < basePath.length(); m++) {
            if (m >= toPath.length()) {
                if (basePath.charAt(m) == '/') {
                    ellipsesCount++;
                }
            }
            else {
                if (basePath.charAt(m) != toPath.charAt(m)) {
                    break;
                }
                else if (basePath.charAt(m) == '/') {
                    truncatePtr = m + 1;
                }
            }
        }
        if (m < toPath.length() && toPath.charAt(m) == '/') {
            if (!(toPath.charAt(m - 1) == '/' && basePath.charAt(m - 1) == '/')) {
                truncatePtr = m + 1;
            }
        }
        if (m == toPath.length()) {
            return new URI(null, null, null, toUri.getQuery(), toUri.getFragment()).toString();
        }
        else {
            toPath = toPath.substring(truncatePtr);
            final StringBuilder sb = new StringBuilder();
            while (ellipsesCount > 0) {
                sb.append("../");
                ellipsesCount--;
            }

            if (!Utility.isNullOrEmpty(toPath)) {
                sb.append(toPath);
            }

            if (!Utility.isNullOrEmpty(toUri.getQuery())) {
                sb.append("?");
                sb.append(toUri.getQuery());
            }
            if (!Utility.isNullOrEmpty(toUri.getFragment())) {
                sb.append("#");
                sb.append(toUri.getRawFragment());
            }

            return sb.toString();
        }
}
}

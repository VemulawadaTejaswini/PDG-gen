//73
public class func{
	public void safeRelativize(final URI baseURI,final URI toUri){
        if (m == toPath.length()) {
            // No path difference, return query + fragment
            return new URI(null, null, null, toUri.getQuery(),
                    toUri.getFragment()).toString();
        } else {
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

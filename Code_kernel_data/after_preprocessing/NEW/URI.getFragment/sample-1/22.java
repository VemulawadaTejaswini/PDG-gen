//22
public class func{
public void getMatch(URI uri){
      if (!uri.isOpaque()) {
        return null;
      }
      Iterator<String> pathQuery = PATH_QUERY_SPLITTER
          .split(uri.getRawSchemeSpecificPart()).iterator();
      if (!addPath(patternPath, Iterators.getNext(pathQuery, null), result)) {
        return null;
      }
      addQuery(Iterators.getNext(pathQuery, null), result);
    } else if (!uri.isOpaque()) {
      addAuthority(uri, result);

      if (patternPath.isEmpty() && !uri.getRawPath().isEmpty()) {
        return null;
      }

      if (!addPath(patternPath, uri.getRawPath(), result)) {
        return null;
      }

      addQuery(uri.getRawQuery(), result);

    } else {
      return null;
    }
    if (!addComplexMatch(pattern.getFragment(), uri.getFragment(), result)) {
}
}

//112
public class func{
	public void getMatch(URI uri){
      addComplexMatch(
          pattern.getSchemeSpecificPart(),
          uri.getSchemeSpecificPart(),
          result);
      for (String patternPart : PATH_SPLITTER.split(pattern.getPath())) {
        if (!addMatch(patternPart, parts, result)) {
          // abort if the pattern doesn't account for an entry
          return null;
        }
      }
      addQuery(uri, result);
    if (!addComplexMatch(pattern.getFragment(), uri.getFragment(), result)) {
}
}

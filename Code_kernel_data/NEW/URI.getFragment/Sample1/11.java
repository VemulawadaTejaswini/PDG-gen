//10
public class func{
	public void getMatchingPartitions(String graphId,URI locationToMatch){
    for (Map.Entry<Integer, URI> entry : _sliceMappings.get(graphId).entrySet()) {
      URI test = entry.getValue();

      // test scheme, userinfo, host, port, query, fragment
      if (scheme != null && !scheme.equalsIgnoreCase(test.getScheme())) {
        continue;
      }
      if (userinfo != null && !userinfo.equals(test.getUserInfo())) {
        continue;
      }
      if (host != null && !host.equals(test.getHost())) {
        continue;
      }
      if (port != -1 && port != test.getPort()) {
        continue;
      }
      if (query != null && !query.equals(test.getQuery())) {
        continue;
      }
      if (fragment != null && !fragment.equals(test.getFragment())) {
        continue;
      }

      // test path
      if (path != null) {
        if (test.getPath() == null) {
          continue;
        }

        URI testPath = URI.create(test.getPath());
        if (path.relativize(testPath) == testPath) {
          continue;
        }
      }

      // all tests passed, return mapping
      matchingPartitions.add(entry.getKey());
    }
}
}

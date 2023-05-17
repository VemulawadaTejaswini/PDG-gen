//114
public class func{
public void retrieveAccessTokenFromFragment(String url){
    URI uri = URI.create(url);
    final String fragment = uri.getFragment();
      if (StringUtil.isNotEmpty(fragment)) {
        parameters = new HashMap<String, String>();
        Scanner scanner = new Scanner(fragment);
      scanner.useDelimiter("&");
      while (scanner.hasNext()) {
              final String[] nameValue = scanner.next().split("=");
              if (nameValue.length == 0 || nameValue.length > 2){
                  throw new IllegalArgumentException("Bad parameter");
              }
              final String name = nameValue[0];
              String value = null;
              if (nameValue.length == 2){
                value = nameValue[1];
              }
              parameters.put(name, value);
          }
      }
}
}

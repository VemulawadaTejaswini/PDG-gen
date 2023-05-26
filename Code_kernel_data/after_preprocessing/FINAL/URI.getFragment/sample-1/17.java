public class func{
public void getLocalFile(URI remoteUri){
      String host = remoteUri.getHost();
      String query = remoteUri.getQuery();
      String path = remoteUri.getPath();
      String fragment = remoteUri.getFragment();
    if (host != null)
    {
      sb.append(host);
    }
    if (path != null)
    {
      sb.append(path);
    }
    if (query != null)
    {
      sb.append('?');
      sb.append(query);
    }
    if (fragment != null)
    {
      sb.append('#');
      sb.append(fragment);
    }
    if (sb.length() < maxLen)
    {
      name = sb.toString();
    }
    else
    {
      name = sb.substring(0, maxLen);
    }
    name = name.replace('"', '$');
    File f = new File(cacheDir, name);
}
}

//6
public class func{
	public void getAbsoluteFile(final MapModel map,final URI uri){
    if(uri == null) {
      return null;
    }    
    if (uri.getFragment() != null) {
      return null;
    }
      if(Compat.isWindowsOS() && (uri.getScheme() != null && uri.getScheme().length() == 1)) { 
        urlConnection = (new File(uri.toString())).toURI().toURL().openConnection();
      } 
      else if(uri.getScheme() == null && !uri.getPath().startsWith(File.separator)) {
        if(map == null) {
          urlConnection = (new File(uri.toString())).toURI().toURL().openConnection();
        } 
        else {
          urlConnection = getAbsoluteUri(map, uri).toURL().openConnection();
        }
      }
      else {
        urlConnection = uri.toURL().openConnection();        
      }
      if (urlConnection == null) {
        return null;
      }
      else {
        URL url = urlConnection.getURL();
        URI absoluteUri = url.toURI();
        if("file".equalsIgnoreCase(absoluteUri.getScheme())) {
          File file = new File(absoluteUri);
          try {
            file = file.getCanonicalFile();
          }
          catch(IOException ignore) {
            LogUtils.info("Exception in org.freeplane.plugin.workspace.mindmapmode.MModeWorkspaceUrlManager.getAbsoluteFile(map, uri) while canonicalizing the file " + file);
            //can be ignored because it's just done to clear the path of unnecessary slashes etc.
          }
          return file;
        }        
      }
      LogUtils.warn(e);
      LogUtils.warn(e);
      LogUtils.warn(e);
}
}

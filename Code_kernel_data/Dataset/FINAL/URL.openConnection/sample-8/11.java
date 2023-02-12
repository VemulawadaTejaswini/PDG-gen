public class func{
public void addDLFileEntry(String resourcePath){
    Long parentFolderId = _folderIds.get(
      FileUtil.getPath(resourcePath) + StringPool.SLASH);
    if (parentFolderId == null) {
      parentFolderId = 0L;
    }
    URL url = servletContext.getResource(resourcePath);
    URLConnection urlConnection = url.openConnection();
      urlConnection.getInputStream(), urlConnection.getContentLength());
}
}

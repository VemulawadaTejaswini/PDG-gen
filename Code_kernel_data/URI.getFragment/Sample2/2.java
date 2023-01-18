//1
public class func{
	public void addToCache(Configuration conf,Path appPath,String filePath,boolean archive){
            if (uri.getScheme() == null) {
                String resolvedPath = uri.getPath();
                if (!resolvedPath.startsWith("/")) {
                    resolvedPath = baseUri.getPath() + "/" + resolvedPath;
                }
                uri = new URI(baseUri.getScheme(), baseUri.getAuthority(), resolvedPath, uri.getQuery(), uri.getFragment());
            }
}
}

public class func{
public void getExistingDistCacheFilePath(Configuration conf,URL url){
            for (URI cacheFileUri : cacheFileUris) {
                Path path = new Path(cacheFileUri);
                String cacheFileName = cacheFileUri.getFragment() == null ? path.getName() : cacheFileUri.getFragment();
                if (fileName.equals(cacheFileName)) {
                    return path;
                }
            }
}
}

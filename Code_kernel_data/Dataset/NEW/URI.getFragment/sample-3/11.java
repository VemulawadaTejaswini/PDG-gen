//11
public class func{
public void getExistingDistCacheFilePath(Configuration conf,URL url){
            for (URI cacheFileUri : cacheFileUris) {
                Path path = new Path(cacheFileUri);
                String cacheFileName = cacheFileUri.getFragment() == null ? path.getName() : cacheFileUri.getFragment();
                // Match
                //     - if both filenames are same and no symlinks (or)
                //     - if both symlinks are same (or)
                //     - symlink of existing cache file is same as the name of the new file to be added.
                //         That would be the case when hbase-0.98.4.jar#hbase.jar is configured via Oozie
                // and register hbase.jar is done in the pig script.
                // If two different files are symlinked to the same name, then there is a conflict
                // and hadoop itself does not guarantee which file will be symlinked to that name.
                // So we are good.
                if (fileName.equals(cacheFileName)) {
                    return path;
                }
            }
}
}

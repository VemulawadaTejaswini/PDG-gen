public class func{
public void moveLocalFiles(Configuration conf){
          if (null != uri.getFragment() && DistributedCache.getSymlink(conf)) {

            FileUtil.symLink(uri.getPath(), uri.getFragment());
            files.append(uri.getFragment()).append(",");
          }
          FileSystem hdfs = FileSystem.get(conf);
}
}

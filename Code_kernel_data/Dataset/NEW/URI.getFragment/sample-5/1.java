//1
public class func{
public void copyAndConfigureFiles(Job job,Path submitJobDir,short replication){
        Path tmp = new Path(tmpURI);
        Path newPath = copyRemoteFiles(archivesDir, tmp, conf,
          replication);
          URI pathURI = getPathURI(newPath, tmpURI.getFragment());
          DistributedCache.addCacheArchive(pathURI, conf);
          throw new IOException("Failed to create uri for " + tmpArchives, ue);
}
}

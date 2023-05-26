public class func{
public void copyAndConfigureFiles(JobConf job,Path submitJobDir,short replication){
       Path tmp = new Path(tmpURI);
       Path newPath = copyRemoteFiles(fs, archivesDir, tmp, job, replication);
         URI pathURI = getPathURI(newPath, tmpURI.getFragment());
         DistributedCache.addCacheArchive(pathURI, job);
         throw new IOException("Failed to create uri for " + tmpArchives, ue);
}
}

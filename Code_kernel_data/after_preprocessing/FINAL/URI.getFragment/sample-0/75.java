public class func{
public void setArchived(Partition p,Path parentDir,String dirInArchive,String archiveName){
      harUri = new URI("har", parentUri.getUserInfo(), harHost, parentUri.getPort(),
          new Path(getArchiveDirOnly(parentDir, archiveName), dirInArchive).toUri().getPath(),
          parentUri.getQuery(), parentUri.getFragment());
}
}

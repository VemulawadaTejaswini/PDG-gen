//77
public class func{
	public void setArchived(Partition p,Path parentDir,String dirInArchive,String archiveName){
      harUri = new URI("har", parentUri.getUserInfo(), harHost, parentUri.getPort(),
          getArchiveDirOnly(parentDir, archiveName),
          parentUri.getQuery(), parentUri.getFragment());
}
}

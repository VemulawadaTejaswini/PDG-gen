public class func{
public void Sync(EmaActivityHelper helper,DropboxWrapper api){
    mLocalDir = mHelper.getDal().Dir();
    File syncMetadataFile = new File(mLocalDir, METADATA_FILE);
    if (!syncMetadataFile.exists()) {
      mSyncMetadata = new JSONObject();
      return;
    }
      br = new BufferedReader(new FileReader(syncMetadataFile), 4096);
      char[] buffer = new char[(int) syncMetadataFile.length()];
      br.read(buffer);
      mSyncMetadata = new JSONObject(new String(buffer));
}
}

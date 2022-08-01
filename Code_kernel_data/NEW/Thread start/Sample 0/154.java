//153
public class func{
	public void doDeleteFolder(long folderId){
    new Thread(new DeleteFolderRunnable(folderId)).start();
}
}

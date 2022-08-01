//133
public class func{
	public void copyContent(InfoGluePrincipal principal,Integer contentId,Integer newParentContentId,Integer maxAssetSize,String onlyLatestVersions,ProcessBean processBean){
    CopyContentController copyController = new CopyContentController(principal, contentId, newParentContentId, maxAssetSize, onlyLatestVersions, processBean);
    Thread thread = new Thread(copyController);
    thread.start();
}
}

//84
public class func{
	public void export(String[] repositories,int assetMaxSize,boolean onlyPublishedVersions,String exportFileName,ProcessBean processBean){
    OptimizedExportController exportController = new OptimizedExportController(repositories, assetMaxSize, onlyPublishedVersions, exportFileName, processBean, false, "false", "", "");
    Thread thread = new Thread(exportController);
    thread.start();
}
}

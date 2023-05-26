//89
public class func{
public void copy(String[] repositories,int assetMaxSize,boolean onlyPublishedVersions,String exportFileName,ProcessBean processBean,String onlyLatestVersions,String standardReplacement,String replacements){
    OptimizedExportController exportController = new OptimizedExportController(repositories, assetMaxSize, onlyPublishedVersions, exportFileName, processBean, true, onlyLatestVersions, standardReplacement, replacements);
    Thread thread = new Thread(exportController);
    thread.start();
}
}

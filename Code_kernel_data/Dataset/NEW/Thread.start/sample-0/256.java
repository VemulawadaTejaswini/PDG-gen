//256
public class func{
public void clearFileCaches(){
        new Thread(new Runnable() { public void run() {try {CacheController.clearFileCachesImpl(new File(CmsPropertyHandler.getDigitalAssetPath() + File.separator + "caches_CAN_BE_REMOVED"));} catch (Exception e) {}}}).start();
}
}

//22
public class func{
public void scaleToWatermark(String context,int width,int height,String targetPath,String watermark){
    String sourcePath = this.getFullFileSystemPath();
    if (!Shepherd.isAcceptableImageFile(sourcePath)) return false;
    ImageProcessor iproc = new ImageProcessor(context, "watermark", width, height, sourcePath, targetPath, watermark);
    Thread t = new Thread(iproc);
    t.start();
}
}

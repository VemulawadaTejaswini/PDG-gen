//54
public class func{
	public void DownloadBufferManager(InputStream source,DiskManagerFileInfo fileInfo){
            Thread t = new Thread(this);
            t.setName("DownloadBuffer");
            t.setDaemon(true);
            t.start();
}
}

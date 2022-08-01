//174
public class func{
	public void startPServers(HadoopAlignConfig hac){
    pserver = new PServer(4444, FileSystem.get(hac), hac.getTTablePath());
    Thread th = new Thread(pserver);
    th.start();
}
}

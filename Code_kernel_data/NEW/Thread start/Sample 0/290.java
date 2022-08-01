//289
public class func{
	public void asyncDiscovery(Discovery.WithDevices wd){
      d = new Discovery(new Socket(DevMachineIP,DiscoveryServerPort));
      d.setWithDevices(wd);
      new Thread(d).start();
}
}

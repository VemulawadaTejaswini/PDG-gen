//28
public class func{
	public void registerServices(JmDNS jmDns,List<ServiceInfo> serviceInfos){
    if(logger.isInfoEnabled()) logger.info("Registering services for {}.", jmDns.getHostName());
    ServiceRegistrationRunnable r = new ServiceRegistrationRunnable(jmDns, serviceInfos);
    Thread t = new Thread(r);
    t.setDaemon(true);
    t.start();
}
}

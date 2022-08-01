//152
public class func{
	public void deploy(Resolver obrResolver,AbstractWebConsolePlugin logger,boolean startBundles,boolean optionalDependencies){
        final FelixDeployer d = new FelixDeployer(obrResolver, logger, startBundles, optionalDependencies);
        final Thread t = new Thread(d, "OBR Bundle Deployer (Apache Felix API)");
        t.start();
}
}

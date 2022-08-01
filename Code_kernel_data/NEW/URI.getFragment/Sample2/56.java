//55
public class func{
	public void run(String[] argv){
        URI fileSystem = FileSystem.getDefaultUri(getConf());
        URI dnProtocolURI = new URI(fileSystem.getScheme(), fileSystem
            .getUserInfo(), fileSystem.getHost(), dnPort, fileSystem.getPath(),
            fileSystem.getQuery(), fileSystem.getFragment());
        FileSystem.setDefaultUri(getConf(), dnProtocolURI);
}
}

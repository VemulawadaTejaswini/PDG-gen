//132
public class func{
	public void isPortBound(String address,int port,String portName,int potentialErrorCode){
            serverSocket.bind(new InetSocketAddress(address, port));
            throw new StorageInstallerException("The " + portName + " (" + address + ":" + port
                + ") is already in use. " + "Installation cannot proceed.", potentialErrorCode);
}
}

//0
public class func{
	public void sendRecvData(String testDescription,boolean eofExpected){
      sock = new Socket();
      sock.connect(dnAddr, HdfsServerConstants.READ_TIMEOUT);
      sock.setSoTimeout(HdfsServerConstants.READ_TIMEOUT);
      OutputStream out = sock.getOutputStream();
}
}

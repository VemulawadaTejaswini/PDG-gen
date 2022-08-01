//2
public class func{
	public void sendRecvData(String testDescription,boolean eofExpected){
      sock = new Socket();
      sock.connect(dnAddr, HdfsConstants.READ_TIMEOUT);
      sock.setSoTimeout(HdfsConstants.READ_TIMEOUT);
      OutputStream out = sock.getOutputStream();
}
}

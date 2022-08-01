//12
public class func{
	public void streamBlockInAscii(InetSocketAddress addr,int namespaceId,long blockId,long genStamp,long blockSize,long offsetIntoBlock,long chunkSizeToView,JspWriter out){
    Socket s = new Socket();
    s.connect(addr, HdfsConstants.READ_TIMEOUT);
    s.setSoTimeout(HdfsConstants.READ_TIMEOUT);
}
}

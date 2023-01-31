//8
public class func{
	public void streamBlockInAscii(InetSocketAddress addr,String poolId,long blockId,Token<BlockTokenIdentifier> blockToken,long genStamp,long blockSize,long offsetIntoBlock,long chunkSizeToView,JspWriter out,Configuration conf){
    Socket s = new Socket();
    s.connect(addr, HdfsServerConstants.READ_TIMEOUT);
    s.setSoTimeout(HdfsServerConstants.READ_TIMEOUT);
}
}

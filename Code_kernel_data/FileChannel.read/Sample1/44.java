//43
public class func{
	public void buildTree(RandomAccessFile raf,boolean closeExit){
                    moovBuffer = ByteBuffer.allocate(boxHeader.getDataLength());
                    fc.read(moovBuffer);
                    moovBuffer.rewind();
                    buildChildrenOfNode(moovBuffer, newAtom);
}
}

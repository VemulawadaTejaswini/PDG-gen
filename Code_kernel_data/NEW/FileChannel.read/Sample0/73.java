//72
public class func{
	public void buildTree(RandomAccessFile raf,boolean closeExit){
                headerBuffer.clear();
                fc.read(headerBuffer);
                headerBuffer.rewind();
                    boxHeader.update(headerBuffer);
                    if (moovNode != null & mdatNode != null) {
                        NullPadding np = new NullPadding(fc.position() - Mp4BoxHeader.HEADER_LENGTH, fc.size());
                        DefaultMutableTreeNode trailingPaddingNode = new DefaultMutableTreeNode(np);
                        rootNode.add(trailingPaddingNode);
                        //logger.warning(ErrorMessage.NULL_PADDING_FOUND_AT_END_OF_MP4.getMsg(np.getFilePos()));
                        break;
                    } else {
                        //File appears invalid
                        throw ne;
                    }
}
}

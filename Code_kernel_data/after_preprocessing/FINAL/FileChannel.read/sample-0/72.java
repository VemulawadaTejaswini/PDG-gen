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
                        break;
                    } else {
                        throw ne;
                    }
}
}

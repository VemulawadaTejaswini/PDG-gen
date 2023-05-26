//9
public class func{
public void moveSubRootContents(File fromSubRoot,File toSubRoot){
                    BBContainer bufC = DBBPool.allocateDirect(8192);
                    ByteBuffer buf = bufC.b();
                        while (inputChannel.read(buf) != -1) {
                            buf.flip();
                            outputChannel.write(buf);
                            buf.clear();
                        }
                        inputChannel.close();
}
}

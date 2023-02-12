public class func{
public void readFull(ByteBuffer dstBuffer,FileChannel srcChannel,long position){
        while(dstBuffer.remaining() > 0) {
            if (srcChannel.read(dstBuffer,
                                    position + dstBuffer.position()) == -1) {
                throw new EOFException(
                    "Reached end of file while attempting to read a "
                    + "whole page.");
            }

            if (Thread.currentThread().isInterrupted() &&
                    !srcChannel.isOpen()) {
                throw new ClosedByInterruptException();
            }
        }
}
}

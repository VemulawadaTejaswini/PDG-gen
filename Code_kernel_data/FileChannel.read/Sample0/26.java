//25
public class func{
	public void readFull(ByteBuffer dstBuffer,FileChannel srcChannel,long position){
        while(dstBuffer.remaining() > 0) {
            if (srcChannel.read(dstBuffer,
                                    position + dstBuffer.position()) == -1) {
                throw new EOFException(
                    "Reached end of file while attempting to read a "
                    + "whole page.");
            }

            // (**) Sun Java NIO is weird: it can close the channel due to an
            // interrupt without throwing if bytes got transferred. Compensate,
            // so we can clean up.  Bug 6979009,
            // http://bugs.sun.com/view_bug.do?bug_id=6979009
            if (Thread.currentThread().isInterrupted() &&
                    !srcChannel.isOpen()) {
                throw new ClosedByInterruptException();
            }
        }
}
}

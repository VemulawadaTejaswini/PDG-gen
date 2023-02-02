//11
public class func{
public void matchReplica(int blockIndex,Checksum.Header checksumHeader,FileChannel replica,FileChannel outFile,MessageDigest md){
            ByteBuffer.allocate(sizeForChecksumBlock(blockIndex,
                                                     checksumHeader));
        long fileOffset = (long) blockIndex * checksumHeader.blockLength();
        int bytesRead = replica.read(replicaBuf, fileOffset);
        if (replicaBuf.hasRemaining()) {
            throw new IllegalStateException(String.format(
                "truncated read from replica (%s), read %d " +
                    "bytes but expected %d more bytes",
                    replica, bytesRead, replicaBuf.remaining()));
        }
        replicaBuf.flip();
}
}

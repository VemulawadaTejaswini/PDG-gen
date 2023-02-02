//24
public class func{
public void readBGZFBlock(final FileInputStream inputStream,final long blockAddress){
            inputBuffer.clear();
            inputBuffer.limit(BlockCompressedStreamConstants.BLOCK_HEADER_LENGTH);
            channel.read(inputBuffer);
            inputBuffer.flip();
            if(inputBuffer.remaining() != BlockCompressedStreamConstants.BLOCK_HEADER_LENGTH)
                throw new ReviewedGATKException("BUG: unable to read a the complete block header in one pass.");
            if(unpackUByte8(inputBuffer,0) != BlockCompressedStreamConstants.GZIP_ID1 ||
                    unpackUByte8(inputBuffer,1) != BlockCompressedStreamConstants.GZIP_ID2 ||
                    unpackUByte8(inputBuffer,3) != BlockCompressedStreamConstants.GZIP_FLG ||
                    unpackUInt16(inputBuffer,10) != BlockCompressedStreamConstants.GZIP_XLEN ||
                    unpackUByte8(inputBuffer,12) != BlockCompressedStreamConstants.BGZF_ID1 ||
                    unpackUByte8(inputBuffer,13) != BlockCompressedStreamConstants.BGZF_ID2) {
                throw new ReviewedGATKException("BUG: Started reading compressed block at incorrect position");
            }
            inputBuffer.position(BlockCompressedStreamConstants.BLOCK_LENGTH_OFFSET);
            bufferSize = unpackUInt16(inputBuffer,BlockCompressedStreamConstants.BLOCK_LENGTH_OFFSET)+1;
            inputBuffer.limit(bufferSize);
            inputBuffer.position(BlockCompressedStreamConstants.BLOCK_HEADER_LENGTH);
            channel.read(inputBuffer);
            uncompressedDataSize = inputBuffer.getInt(inputBuffer.limit()-4);
        inputBuffer.flip();
}
}
